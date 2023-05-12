package OldTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task0165_CF1473A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            int numberOfValues = in.nextInt();
            int purpose = in.nextInt();
            int[] values = new int[numberOfValues];
            for (int i = 0; i < numberOfValues; i++) values[i] = in.nextInt();
            Arrays.sort(values);
            if (values[0] + values[1] <= purpose || values[values.length - 1] <= purpose) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
