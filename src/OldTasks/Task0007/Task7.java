package OldTasks.Task0007;

import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        List<String> list = ReadInput.readInput();
        System.out.println(lineComparator(list));
    }

    public static int lineComparator(List<String> list) {
        String line = list.get(0).toLowerCase();
        String line_1 = list.get(1).toLowerCase();

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) < line_1.charAt(i)) {
                return -1;
            } else if (line.charAt(i) > line_1.charAt(i)) {
                return 1;
            }
        }
        return 0;
    }
}
