import java.util.*;

public class Task0074_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            int numberOfValues = in.nextInt();
            int[] values = new int[numberOfValues];
            int[] tempArray;
            int maxValue = 0, result, tempMaxValue;
            List<Integer> results = new ArrayList<>();

            for (int j = 0; j < values.length; j++) {
                values[j] = in.nextInt();
                if (values[j] > maxValue && j != 0 && j != values.length - 1) {
                    maxValue = values[j];
                }
            }

            if (values.length == 1) {
                System.out.println(values[0]);
                continue;
            }

            if (values.length == 2) {
                if (values[0] == values[1]) {
                    result = values[0];
                    values[1] = values[1] - (values[0] - 1);
                    result += values[1];
                } else {
                    result = Math.max(values[0], values[1]);
                }
                System.out.println(result);
                continue;
            }

            if (maxValue < values[0]) {
                tempArray = values.clone();
                result = explosiveUp(tempArray, tempArray[0] - 1, 0);
                result += Arrays.stream(tempArray).reduce(Integer::sum).getAsInt();
                results.add(result);
            }

            if (maxValue < values[values.length - 1]) {
                tempArray = values.clone();
                result = explosiveDown(tempArray, tempArray[values.length - 1] - 1, tempArray.length - 1);
                result += Arrays.stream(tempArray).reduce(Integer::sum).getAsInt();
                results.add(result);
            }

            for (int j = 1; j < values.length - 1; j++) {
                if (values[j] == maxValue) {
                    tempArray = values.clone();
                    tempMaxValue = Math.max(0, tempArray[j] - 1);
                    result = explosiveDown(tempArray, tempMaxValue, j);
                    explosiveUp(tempArray, tempMaxValue, j);
                    result += Arrays.stream(tempArray).reduce(Integer::sum).getAsInt();
                    results.add(result);
                }
            }
            System.out.println(results);
            System.out.println(Collections.min(results));
        }
    }

    public static int explosiveDown(int[] values, int maxValue, int temp) {
        int maxIndex = temp;
        while (--temp >= 0) {
            if (values[temp] <= maxValue) {
                maxValue = Math.max(values[temp] - 1, 0);
                values[temp] = 0;
            } else {
                values[temp] -= maxValue;
                break;
            }
        }
        int result = values[maxIndex];
        values[maxIndex] = 0;
        return result;
    }

    public static int explosiveUp(int[] values, int maxValue, int temp) {
        int maxIndex = temp;
        while (++temp < values.length) {
            if (values[temp] <= maxValue) {
                maxValue = Math.max(values[temp] - 1, 0);
                values[temp] = 0;
            } else {
                values[temp] -= maxValue;
                break;
            }
        }
        int result = values[maxIndex];
        values[maxIndex] = 0;
        return result;
    }
}