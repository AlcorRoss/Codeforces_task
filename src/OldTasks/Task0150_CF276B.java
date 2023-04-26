package OldTasks;

import java.util.Scanner;
import java.util.TreeMap;

public class Task0150_CF276B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.next();
        TreeMap<Character, Integer> numberOfChar = new TreeMap<>();
        int counter = 0;

        for (int i = 0; i < line.length(); i++) numberOfChar.merge(line.charAt(i), 1, Integer::sum);
        for (Integer value : numberOfChar.values()) if (value % 2 != 0) counter++;
        if (counter == 0 || counter == 1) {
            System.out.println("First");
        } else if (counter % 2 == 0) {
            System.out.println("Second");
        } else {
            System.out.println("First");
        }
    }
}
