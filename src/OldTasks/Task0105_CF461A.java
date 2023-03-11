package OldTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task0105_CF461A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfValues = in.nextInt();
        long temp = 0;
        long[] values = new long[numberOfValues];
        long[] sumValues = new long[numberOfValues];

        for (int i = 0; i < values.length; i++) values[i] = in.nextLong();
        Arrays.sort(values);
        for (int i = values.length - 1; i >= 0; i--) {
            sumValues[i] = values[i] + temp;
            temp = sumValues[i];
        }
        temp = Arrays.stream(values).sum();
        temp -= values[values.length - 1];
        temp += Arrays.stream(sumValues).sum();
        System.out.println(temp);
    }
}