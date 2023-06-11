package OldTasks;

import java.util.Scanner;

public class Task0198_CF935A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int value = in.nextInt();
        int counter = 0;
        int boss = 0;
        while (value > boss) {
            value--;
            boss++;
            if (value % boss == 0) counter++;
        }
        System.out.println(counter);
    }
}
