package OldTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task0201_CF1462A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            int numberOfValues = in.nextInt();
            int temp;
            int[] values = new int[numberOfValues];
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < numberOfValues; i++) values[i] = in.nextInt();
            if (values.length % 2 == 0) temp = values.length / 2;
            else temp = values.length / 2 + 1;
            for (int i = 0; i < temp; i++) {
                result.add(values[i]);
                if (i == values.length / 2) break;
                result.add(values[values.length - 1 - i]);
            }
            result.forEach(v -> System.out.print(v + " "));
            System.out.println();
        }
    }
}
