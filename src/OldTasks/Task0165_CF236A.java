package OldTasks;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task0165_CF236A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] values = in.next().toCharArray();
        Set<Character> result = new HashSet<>();

        for (char value : values) result.add(value);
        if (result.size() % 2 != 0) System.out.println("IGNORE HIM!");
        else System.out.println("CHAT WITH HER!");
    }
}
