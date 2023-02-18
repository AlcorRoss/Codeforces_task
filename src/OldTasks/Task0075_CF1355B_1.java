package OldTasks;

import java.util.Scanner;

public class Task0075_CF1355B_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            int numberOfValues = in.nextInt();
            int counter = 0, buffer = 0;
            int[] values = new int[numberOfValues + 1];

            for (int i = 0; i < numberOfValues; i++) {
                values[in.nextInt()] += 1;
            }

            for (int i = 1; i < values.length; i++) {
                counter += (values[i] + buffer) / i;
                buffer = (values[i] + buffer) % i;
            }
            System.out.println(counter);
        }
    }
}
