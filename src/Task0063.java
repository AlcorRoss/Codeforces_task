import java.util.Arrays;
import java.util.Scanner;

public class Task0063 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfValues = in.nextInt();
        int[] values = new int[numberOfValues];
        int[] sortedValues = new int[numberOfValues];

        for (int i = 0; i < values.length; i++) {
            values[i] = in.nextInt();
            sortedValues[i] = values[i];
        }

        Arrays.sort(sortedValues);

        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            int type = in.nextInt();
            int origin = in.nextInt() - 1;
            int bound = in.nextInt() - 1;
            long result = 0;

            switch (type) {
                case (1) -> {
                    for (int j = origin; j <= bound; j++) {
                        result += values[j];
                    }
                }
                case (2) -> {
                    for (int j = origin; j <= bound; j++) {
                        result += sortedValues[j];
                    }
                }
            }

            System.out.println(result);
        }
    }
}
