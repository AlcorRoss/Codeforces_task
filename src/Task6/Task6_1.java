package Task6;

import java.util.List;

public class Task6_1 {
    public static void main(String[] args) {
        List<Integer> list = ReadInput_1.readInput();
        stepCounter(list);
    }

    public static void stepCounter(List<Integer> list) {
        int line = 0, column = 0, result;

        for (int i = 0; i < 25; i++) {
            if (list.get(i) == 1) {
                line = i / 5;
                column = i % 5;
                break;
            }
        }

        result = Math.abs(line - 2) + Math.abs(column - 2);
        System.out.println(line);
        System.out.println(column);
        System.out.println(result);
    }
}
