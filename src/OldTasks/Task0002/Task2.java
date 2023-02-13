package OldTasks.Task0002;

import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> list = ReadInput.readInput();
        counter(list);
    }

    public static void counter(List<String> list) {
        int counter = 0, result = 0;

        for (String s : list) {
            for (String temp : s.split(" ")) {
                counter += Integer.parseInt(temp);
            }
            if (counter > 1) {
                result++;
                counter = 0;
            } else {
                counter = 0;
            }
        }

        System.out.println(result);
    }
}
