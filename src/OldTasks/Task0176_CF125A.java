package OldTasks;

import java.util.Scanner;

public class Task0176_CF125A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        int temp = value % 3;
        value /= 3;
        if (temp > 1) value++;
        System.out.println(value / 12 + " " + (value % 12));
    }
}
