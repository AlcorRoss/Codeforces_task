import java.util.*;

public class Task0074 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            int numberOfValues = in.nextInt();
            int[] values = new int[numberOfValues];
            int[] tempArray;
            int maxIndex = 0, maxValue = 0, counter, temp, result;
            List<Integer> results = new ArrayList<>();

            for (int j = 0; j < values.length; j++) {
                values[j] = in.nextInt();
                if (values[j] > maxValue && j != 0 && j != values.length - 1) {
                    maxValue = values[j];
                    maxIndex = j;
                }
            }

            if (values.length == 1) {
                System.out.println(values[0]);
                continue;
            }

            if (values.length == 2) {
                if (values[0] == values[1]) {
                    counter = values[0];
                    values[1] = values[1] - (values[0] - 1);
                    counter += values[1];
                } else {
                    counter = Math.max(values[0], values[1]);
                }
                System.out.println(counter);
                continue;
            }

            if (maxValue < values[0]) {
                tempArray = values.clone();
                explosiveUp(tempArray, tempArray[0], 0);
                result = tempArray[0];
                tempArray[0] = 0;
                temp = Arrays.stream(tempArray).reduce(Integer::sum).getAsInt();
                result += temp;
                results.add(result);
            }

            if (maxValue < values[values.length - 1]) {
                tempArray = values.clone();
                explosiveDown(tempArray, tempArray[values.length - 1], tempArray.length - 1);
                result = tempArray[values.length - 1];
                tempArray[values.length - 1] = 0;
                temp = Arrays.stream(tempArray).reduce(Integer::sum).getAsInt();
                result += temp;
                results.add(result);
            }

            counter = maxValue;
            maxValue = Math.max(0, values[maxIndex] - 1);
            temp = maxIndex;

            explosiveDown(values, maxValue, temp);

            maxValue = Math.max(0, values[maxIndex] - 1);
            values[maxIndex] = 0;

            explosiveUp(values, maxValue, temp);

            temp = Arrays.stream(values).reduce(Integer::sum).getAsInt();
            counter += temp;
            results.add(counter);
            System.out.println(Collections.min(results));
        }
    }

    public static void explosiveDown(int[] values, int maxValue, int temp) {
        while (--temp >= 0) {
            if (values[temp] <= maxValue) {
                maxValue = Math.max(values[temp] - 1, 0);
                values[temp] = 0;
            } else {
                values[temp] -= maxValue;
                break;
            }
        }
    }

    public static void explosiveUp(int[] values, int maxValue, int temp) {
        while (++temp < values.length) {
            if (values[temp] <= maxValue) {
                maxValue = Math.max(values[temp] - 1, 0);
                values[temp] = 0;
            } else {
                values[temp] -= maxValue;
                break;
            }
        }
    }
}