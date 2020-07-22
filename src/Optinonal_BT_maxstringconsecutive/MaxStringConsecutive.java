package Optinonal_BT_maxstringconsecutive;

import java.util.LinkedList;
import java.util.Scanner;

public class MaxStringConsecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = sc.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                    int index = string.indexOf(string.charAt(j));
                    int index1 = string.indexOf(list.getLast());
                    if(index != index1+1){
                        break;
                    }
                }
            }

            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }

        for (Character ch : max) {
            System.out.print(ch + "\t");
        }
        System.out.println();
    }
}
