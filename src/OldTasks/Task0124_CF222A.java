package OldTasks;

import java.util.Scanner;

public class Task0124_CF222A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfValues = in.nextInt();
        int purpose = in.nextInt();
        int purposeValue, result = 0;
        int[] values = new int[numberOfValues];

        for (int i = 0; i < values.length; i++) values[i] = in.nextInt();
        purposeValue = values[purpose - 1];
        for (int i = purpose; i < values.length; i++) {
            if (values[i] != purposeValue) {
                System.out.println(-1);
                return;
            }
        }
        for (int i = 0; i < purpose - 1; i++) if (values[i] != purposeValue) result = i + 1;
        System.out.println(result);
    }
}
