package OldTasks;

import java.util.Scanner;

public class Task0206_CF1702A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            int value = in.nextInt();
            int round = 1;
            while (value > round) round *= 10;
            if (value == round) System.out.println(0);
            else System.out.println(value - (round / 10));
        }
    }
}
