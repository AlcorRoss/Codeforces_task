package OldTasks.Task0026;

import java.util.List;

public class Task26 {
    public static void main(String[] args) {
        List<String> stringList = ReadInput.readInput();
        calculate(stringList);
    }

    public static void calculate(List<String> stringList) {
        int temp;

        for (String s : stringList) {
            temp = 180 - (Integer.parseInt(s));

            if (360 % temp == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
