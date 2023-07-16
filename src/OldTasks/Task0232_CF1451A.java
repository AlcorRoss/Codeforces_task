package OldTasks;

import java.util.Scanner;

public class Task0232_CF1451A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        var numberOfValues = in.nextInt();
        while (numberOfValues-- > 0) {
            int steps = 0;
            var value = in.nextInt();
            while (value != 1) {
                if (value % 2 == 0 && value > 2) {
                    value = value / (value / 2);
                } else {
                    value--;
                }
                steps++;
            }
            System.out.println(steps);
        }
    }
}
