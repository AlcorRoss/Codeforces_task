package OldTasks.Task0001;

import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = ReadInput.readInput();
        abbreviation(list);
    }

    public static void abbreviation(List<String> list) {
        for (String s : list) {
            if (s.length() > 10) {
                System.out.println(s.substring(0, 1) + (s.length() - 2) + s.substring(s.length() - 1));
            } else {
                System.out.println(s);
            }
        }
    }
}
