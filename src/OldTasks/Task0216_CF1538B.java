package OldTasks;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Task0216_CF1538B {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int numberOfTest = in.nextInt();

        while (numberOfTest-- > 0) {
            int numberOfValue = in.nextInt();
            int[] values = new int[numberOfValue];
            int result = 0;
            for (int i = 0; i < numberOfValue; i++) values[i] = in.nextInt();
            var sum = IntStream.of(values).sum();
            if (sum % numberOfValue != 0) {
                System.out.println(-1);
                continue;
            } else {
                sum /= numberOfValue;
            }
            for (int value : values) if (value > sum) result++;
            System.out.println(result);
        }
    }
}
