package OldTasks;

import java.util.Scanner;

public class Task0230_CF1041A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int numberOfValues = in.nextInt();
        int max = 0, min = Integer.MAX_VALUE;
        for (int i = 0; i < numberOfValues; i++) {
            int temp = in.nextInt();
            max = Math.max(max, temp);
            min = Math.min(min, temp);
        }
        min--;
        System.out.println(max - min - numberOfValues);
    }
}
