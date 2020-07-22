package Optional_BT_recursivealgorithm;

import java.util.*;

public class RecursiveAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = sc.nextLine();
        Character ch = 'b';
        ArrayList<Character> strings = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            strings.add(string.charAt(i));
        }
        Collections.sort(strings);
        System.out.println(strings);

        if(searchBinary(strings,0, strings.size()-1,ch) != -1){
            System.out.println("Strings has value '" + ch + "'" +'!');
        }else
            System.out.println("Strings has not value '" + ch + "'" +'!');
    }

    public static int searchBinary(ArrayList<Character> strings, int low, int high, Character value) {
        int mid = (low + high) / 2;
        if (high >= low) {
            if (strings.get(mid) == value) {
                return mid;
            } else if (strings.get(mid) > value) {
                return searchBinary(strings, low, mid - 1, value);
            } else if (strings.get(mid) < value) {
                return searchBinary(strings, mid + 1, high, value);
            }
        }
        return -1;
    }
}
