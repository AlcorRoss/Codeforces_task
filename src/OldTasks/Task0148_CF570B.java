package OldTasks;

import java.util.Scanner;

public class Task0148_CF570B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = in.nextInt();
        int value = in.nextInt();

        if (max == value && max == 1) System.out.println(1);
        else if (max - value > value - 1) System.out.println(value + 1);
        else System.out.println(value - 1);
    }
}
