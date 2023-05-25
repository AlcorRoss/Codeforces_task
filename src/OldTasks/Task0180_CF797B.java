package OldTasks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Task0180_CF797B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfValues = in.nextInt();
        List<Integer> positiveValues = new ArrayList<>();
        List<Integer> negativeValues = new ArrayList<>();
        int result;

        while (numberOfValues-- > 0) {
            int temp = in.nextInt();
            if (temp >= 0) positiveValues.add(temp);
            else negativeValues.add(temp);
        }
        var sum = positiveValues.stream().reduce(Integer::sum);
        if (sum.isPresent()) {
            result = sum.get();
            if (result % 2 != 0) {
                System.out.println(result);
                return;
            }
            positiveValues.sort(Comparator.naturalOrder());
            negativeValues.sort(Comparator.reverseOrder());
            int tempMin = Integer.MIN_VALUE;
            for (Integer value : positiveValues) {
                if (value % 2 != 0) {
                    tempMin = result - value;
                    break;
                }
            }
            for (Integer value : negativeValues) {
                if (value % 2 != 0) {
                    tempMin = Math.max(result + value, tempMin);
                    break;
                }
            }
            System.out.println(tempMin);
            return;
        }
        negativeValues.sort(Comparator.reverseOrder());
        for (Integer value : negativeValues) {
            if (value % 2 != 0) {
                System.out.println(value);
                return;
            }
        }
    }
}
