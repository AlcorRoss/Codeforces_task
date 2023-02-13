package OldTasks.Task0010;

import java.util.HashSet;
import java.util.Set;

public class Task10_1 {
    public static void main(String[] args) {
        String line = ReadInput.readInput();
        switcher(line);
    }

    public static void switcher(String line) {
        Set<Character> charSet = new HashSet<>();
        char[] chars = line.toCharArray();

        for (char c : chars) {
            charSet.add(c);
        }

        switch (charSet.size() % 2) {
            case 0 -> System.out.println("CHAT WITH HER!");
            case 1 -> System.out.println("IGNORE HIM!");
        }
    }
}
