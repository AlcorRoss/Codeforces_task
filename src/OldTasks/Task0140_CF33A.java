package OldTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task0140_CF33A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTooth = in.nextInt();
        int numberOfRows = in.nextInt();
        int maxValue = in.nextInt();
        int temp;
        int[] rows = new int[numberOfRows + 1];
        Arrays.fill(rows, Integer.MAX_VALUE);
        rows[0] = 0;

        while (numberOfTooth-- > 0) {
            temp = in.nextInt();
            rows[temp] = Math.min(rows[temp], in.nextInt());
        }
        maxValue = Math.min(maxValue, Arrays.stream(rows).sum());
        System.out.println(maxValue);
    }
}
