package OldTasks;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Task0245_CF999A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        var numberOfValues = in.nextInt();
        var max = in.nextInt();
        int[] values = new int[numberOfValues];
        int result = 0;

        IntStream.range(0, numberOfValues).forEach(index -> values[index] = in.nextInt());
        for (int value : values) {
            if (value <= max) result++;
            else break;
        }
        for (int i = values.length - 1; i >= 0; i--) {
            if (values[i] <= max) result++;
            else break;
        }
        System.out.println(Math.min(result, values.length));
    }
}
