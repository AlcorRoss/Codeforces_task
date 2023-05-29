package OldTasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task0184_CF518B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int counter = 0, counter1 = 0;
        char[] purpose = in.next().toCharArray();
        char[] temp = in.next().toCharArray();
        Map<Character, Integer> chars = new HashMap<>();

        for (char c : temp) chars.merge(c, 1, Integer::sum);
        for (int i = 0; i < purpose.length; i++) {
            char c = purpose[i];
            if (chars.containsKey(c) && chars.get(c) != 0) {
                counter++;
                chars.put(c, chars.get(c) - 1);
                purpose[i] = '0';
            }
        }
        for (char c : purpose) {
            if (c == '0') continue;
            if (chars.containsKey(Character.toLowerCase(c)) && chars.get(Character.toLowerCase(c)) != 0) {
                char tempChar = Character.toLowerCase(c);
                counter1++;
                chars.put(tempChar, chars.get(tempChar) - 1);
            } else if (chars.containsKey(Character.toUpperCase(c)) && chars.get(Character.toUpperCase(c)) != 0) {
                char tempChar = Character.toUpperCase(c);
                counter1++;
                chars.put(tempChar, chars.get(tempChar) - 1);
            }
        }
        System.out.println(counter + " " + counter1);
    }
}
