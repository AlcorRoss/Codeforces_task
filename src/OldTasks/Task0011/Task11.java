package OldTasks.Task0011;

import java.util.ArrayList;
import java.util.List;

public class Task11 {
    public static void main(String[] args) {
        String line = ReadInput.readInput();
        counter(line);
    }

    public static void counter(String line) {
        List<Character> characterList = new ArrayList<>();
        char[] chars = line.toCharArray();

        characterList.add(chars[0]);
        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] != chars[i]) characterList.add(chars[i]);
        }

        System.out.println(chars.length - characterList.size());
    }
}
