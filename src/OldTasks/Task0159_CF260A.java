package OldTasks;

import java.util.Scanner;

public class Task0159_CF260A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int digitA = in.nextInt();
        int digitB = in.nextInt();
        int steps = in.nextInt();

        int prev = digitA;
        for (int i = 0; i < 10; i++) {
            int temp = Integer.parseInt(String.valueOf(digitA) + i);
            if (temp % digitB == 0) {
                digitA = temp;
                break;
            }
        }
        if (prev == digitA) {
            System.out.println(-1);
        } else {
            System.out.print(digitA);
            while (steps-- > 1) System.out.print(0);
        }
    }
}
