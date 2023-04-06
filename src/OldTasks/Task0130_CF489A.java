package OldTasks;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task0130_CF489A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfValues = in.nextInt();
        int[] values = new int[numberOfValues];
        int[] sortValues;
        int result = 0;
        Map<Integer, Integer> steps = new LinkedHashMap<>();

        for (int i = 0; i < values.length; i++) values[i] = in.nextInt();
        sortValues = values.clone();
        Arrays.sort(sortValues);
        for (int i = 0; i < sortValues.length; i++) {
            if (values[i] != sortValues[i]) {
                for (int j = i + 1; j < values.length; j++) {
                    if (sortValues[i] == values[j]) {
                        steps.put(i, j);
                        result++;
                        values[j] = values[i];
                        values[i] = sortValues[i];
                        break;
                    }
                }
            }
        }
        System.out.println(result);
        for (Map.Entry<Integer, Integer> entry : steps.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
