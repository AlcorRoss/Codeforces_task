package OldTasks;

import java.util.Scanner;

public class Task0191_CF34A {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int numberOfValue = scanner.nextInt();
        int[] values = new int[numberOfValue];
        int min, index = 0, index2 = numberOfValue - 1;

        for (int i = 0; i < values.length; i++) values[i] = scanner.nextInt();

        min = Math.abs(values[0] - values[values.length - 1]);
        if (min == 0) {
            System.out.println(++index + " " + ++index2);
            return;
        }
        for (int i = 1; i < values.length; i++) {
            int temp = Math.abs(values[i - 1] - values[i]);
            if (temp == 0) {
                System.out.println(i + " " + ++i);
                return;
            }
            if (temp < min) {
                min = temp;
                index = i - 1;
                index2 = i;
            }
        }
        System.out.println(++index + " " + ++index2);
    }
}