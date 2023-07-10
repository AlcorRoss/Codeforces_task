package OldTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task0226_CF1003A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int numberOfTokens = in.nextInt();
        int[] values = new int[101];
        while (numberOfTokens-- > 0) values[in.nextInt()]++;
        Arrays.sort(values);
        System.out.println(values[100]);
    }
}
