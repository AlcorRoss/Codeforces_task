package OldTasks;

import java.util.Scanner;

public class Task0138_CF1030A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfValues = in.nextInt();
        boolean flag = false;
        while (numberOfValues-- > 0) if (in.nextInt() == 1) flag = true;
        if (flag) System.out.println("HARD");
        else System.out.println("EASY");
    }
}
