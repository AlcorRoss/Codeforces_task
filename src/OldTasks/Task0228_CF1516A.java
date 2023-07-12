package OldTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task0228_CF1516A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int numberOfValues = in.nextInt();

        while (numberOfValues-- > 0) {
            int arrayLength = in.nextInt();
            int steps = in.nextInt();
            int[] values = new int[arrayLength];
            for (int i = 0; i < values.length; i++) values[i] = in.nextInt();
            for (int i = 0; i < values.length - 1; i++) {
                if (steps - values[i] > 0) {
                    steps -= values[i];
                    values[values.length - 1] += values[i];
                    values[i] = 0;
                } else {
                    values[i] -= steps;
                    values[values.length - 1] += steps;
                    break;
                }
            }
            Arrays.stream(values).forEach(v -> System.out.print(v + " "));
            System.out.println();
        }
    }
}
