package OldTasks.Task0006;

import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        List<String> list = ReadInput.readInput();
        stepCounter(list);
    }

    public static void stepCounter(List<String> list) {
        int line = 0, column = 0, result;
        boolean flag = false;

        for (int i = 0; i < 5; i++) {
            if (flag) break;

            String[] temp = list.get(i).split(" ");
            for (int j = 0; j < 5; j++) {
                if (temp[j].equals("1")) {
                    line = i;
                    column = j;
                    flag = true;
                    break;
                }
            }
        }

        result = Math.abs(line - 2) + Math.abs(column - 2);
        System.out.println(result);
    }
}
