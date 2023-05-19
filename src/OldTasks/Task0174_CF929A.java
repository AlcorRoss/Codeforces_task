package OldTasks;

import java.util.Scanner;

public class Task0174_CF929A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfValues = in.nextInt();
        int range = in.nextInt();
        int result = 1;
        int[] values = new int[numberOfValues];

        for (int i = 0; i < numberOfValues; i++) values[i] = in.nextInt();
        for (int i = 1; i < values.length; i++) {
            if (values[i] - values[i - 1] > range) {
                System.out.println(-1);
                return;
            }
        }
        int temp = range + values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > temp) {
                result++;
                temp = values[i - 1] + range;
            }
        }
        System.out.println(result);
    }
}
