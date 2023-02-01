import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task0047 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            int numberOfValues = in.nextInt();
            int[] values = new int[numberOfValues];
            List<Integer> sequenceFromPositive = new ArrayList<>();
            List<Integer> sequenceFromNegative = new ArrayList<>();
            int tempPositive = 0, tempNegative = 0, result, firstPositiveIndex = 0, firstNegativeIndex = 0;

            for (int j = 0; j < numberOfValues; j++) {
                values[j] = in.nextInt();
            }

            //Finding the index of the first positive value.
            for (int j = 0; j < values.length; j++) {
                if (values[j] > 0) {
                    firstPositiveIndex = j;
                    break;
                }
            }

            // Finding the largest sequence from the first positive value.
            for (int j = firstPositiveIndex; j < values.length; j++) {
                if (values[j] > 0 && sequenceFromPositive.size() % 2 == 0) {
                    tempPositive = Math.max(tempPositive, values[j]);
                    if (j == values.length - 1) sequenceFromPositive.add(tempPositive);
                } else if (values[j] < 0 && sequenceFromPositive.size() % 2 == 0) {
                    sequenceFromPositive.add(tempPositive);
                    tempPositive = 0;
                    tempNegative = values[j];
                }

                if (values[j] < 0 && sequenceFromPositive.size() % 2 != 0) {
                    tempNegative = Math.max(tempNegative, values[j]);
                    if (j == values.length - 1) sequenceFromPositive.add(tempNegative);
                } else if (values[j] > 0 && sequenceFromPositive.size() % 2 != 0) {
                    sequenceFromPositive.add(tempNegative);
                    tempNegative = 0;
                    tempPositive = values[j];
                }
            }

            //Finding the index of the first negative value
            for (int j = 0; j < values.length; j++) {
                if (values[j] < 0) {
                    firstNegativeIndex = j;
                    break;
                }
            }

            tempNegative = tempPositive = 0;

            // Finding the largest sequence from the first negative value.
            for (int j = firstNegativeIndex; j < values.length; j++) {
                if (values[j] < 0 && sequenceFromNegative.size() % 2 == 0) {
                    tempNegative = Math.max(tempNegative, values[j]);
                    if (j == values.length - 1) sequenceFromNegative.add(tempNegative);
                } else if (values[j] > 0 && sequenceFromNegative.size() % 2 == 0) {
                    sequenceFromNegative.add(tempNegative);
                    tempNegative = 0;
                    tempPositive = values[j];
                }

                if (values[j] > 0 && sequenceFromNegative.size() % 2 != 0) {
                    tempPositive = Math.max(tempPositive, values[j]);
                    if (j == values.length - 1) sequenceFromNegative.add(tempPositive);
                } else if (values[j] < 0 && sequenceFromNegative.size() % 2 != 0) {
                    sequenceFromNegative.add(tempPositive);
                    tempPositive = 0;
                    tempNegative = values[j];
                }
            }

            if (sequenceFromPositive.size() > sequenceFromNegative.size()) {
                result = sequenceSum(sequenceFromPositive);
            } else if (sequenceFromPositive.size() < sequenceFromNegative.size()) {
                result = sequenceSum(sequenceFromNegative);
            } else {
                result = Math.max(sequenceSum(sequenceFromNegative), sequenceSum(sequenceFromPositive));
            }

            System.out.println(result);
        }
    }

    public static int sequenceSum(List<Integer> values) {
        int result = 0;
        for (int value : values) {
            result += value;
        }
        return result;
    }
}
