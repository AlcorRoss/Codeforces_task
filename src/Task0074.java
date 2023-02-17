import java.util.Arrays;
import java.util.Scanner;

public class Task0074 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            int numberOfValues = in.nextInt();
            int[] values = new int[numberOfValues];
            int maxIndex = 0, maxValue = 0, counter, temp;

            for (int j = 0; j < values.length; j++) {
                values[j] = in.nextInt();
                if (values[j] > maxValue && j != 0 && j != values.length - 1) {
                    maxValue = values[j];
                    maxIndex = j;
                }
            }
            counter = maxValue;

            temp = maxIndex;

            while (--temp >= 0) {
                if (values[temp] <= maxValue) {
                    maxValue = Math.max(values[temp] - 1, 0);
                    values[temp] = 0;
                } else {
                    values[temp] -= maxValue;
                    break;
                }
            }

            temp = maxIndex;
            maxValue = values[maxIndex];
            values[maxIndex] = 0;

            while (++temp < values.length) {
                if (values[temp] <= maxValue) {
                    maxValue = Math.max(values[temp] - 1, 0);
                    values[temp] = 0;
                } else {
                    values[temp] -= maxValue;
                    break;
                }
            }

            temp = Arrays.stream(values).reduce(Integer::sum).getAsInt();
            counter += temp;
            System.out.println(counter);
        }
    }
}
