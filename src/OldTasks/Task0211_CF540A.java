package OldTasks;

import java.util.Scanner;

public class Task0211_CF540A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        in.nextInt();
        int result = 0;
        char[] startPosition = in.next().toCharArray();
        char[] purposePosition = in.next().toCharArray();

        for (int i = 0; i < startPosition.length; i++) {
            int start = Integer.parseInt(String.valueOf(startPosition[i]));
            int purpose = Integer.parseInt(String.valueOf(purposePosition[i]));
            int steps = Math.min(Math.abs(start - purpose), start + 10 - purpose);
            steps = Math.min(Math.abs(start - (purpose + 10)), steps);
            result += steps;
        }
        System.out.println(result);
    }
}
