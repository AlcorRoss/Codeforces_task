package OldTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task0063_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfValues = in.nextInt();
        long[] values = new long[numberOfValues];
        long[] sortedValues = new long[numberOfValues];

        for (int i = 0; i < values.length; i++) {
            values[i] = in.nextInt();
            sortedValues[i] = values[i];
        }

        Arrays.sort(sortedValues);

        for (int i = 1; i < values.length; i++) {
            values[i] += values[i - 1];
            sortedValues[i] += sortedValues[i - 1];
        }

        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            int type = in.nextInt();
            int origin = in.nextInt() - 2;
            int bound = in.nextInt() - 1;

            if (origin < 0) {
                switch (type) {
                    case (1) -> System.out.println(values[bound]);
                    case (2) -> System.out.println(sortedValues[bound]);
                }
            } else {
                switch (type) {
                    case (1) -> System.out.println(values[bound] - values[origin]);
                    case (2) -> System.out.println(sortedValues[bound] - sortedValues[origin]);
                }
            }
        }

    }
}
