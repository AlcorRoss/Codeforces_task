package OldTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task0101_CF27A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfValues = in.nextInt();
        int[] values = new int[numberOfValues];
        int temp;

        for (int i = 0; i < values.length; i++) values[i] = in.nextInt();
        Arrays.sort(values);
        if (values[0] > 1) {
            System.out.println(1);
            return;
        }
        temp = values[0];
        for (int value : values) {
            if (value - temp > 1) {
                System.out.println(temp + 1);
                return;
            }
            temp = value;
        }
        System.out.println(temp + 1);
    }
}
