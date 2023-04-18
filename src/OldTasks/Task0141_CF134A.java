package OldTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task0141_CF134A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfValues = in.nextInt();
        int[] values = new int[numberOfValues];
        double sum;
        int counter = 0;
        StringBuilder st = new StringBuilder();

        for (int i = 0; i < values.length; i++) values[i] = in.nextInt();
        sum = Arrays.stream(values).sum();
        for (int i = 0; i < values.length; i++) {
            if (((sum - values[i]) / (numberOfValues - 1)) == values[i]) {
                counter++;
                st.append(i + 1).append(" ");
            }
        }
        System.out.println(counter);
        System.out.println(st);
    }
}
