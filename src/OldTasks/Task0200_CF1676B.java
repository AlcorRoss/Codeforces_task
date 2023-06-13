package OldTasks;

import java.util.Scanner;

public class Task0200_CF1676B {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int numberOfTest = in.nextInt();

        while (numberOfTest-- > 0) {
            int numberOfValues = in.nextInt();
            long min = Integer.MAX_VALUE;
            long sum = 0;
            int temp;
            for (int i = 0; i < numberOfValues; i++) {
                temp = in.nextInt();
                min = Math.min(temp, min);
                sum += temp;
            }
            System.out.println(sum - (min * numberOfValues));
        }
    }
}
