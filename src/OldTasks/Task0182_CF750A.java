package OldTasks;

import java.util.Scanner;

public class Task0182_CF750A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTasks = in.nextInt();
        int time = in.nextInt();
        int counter = 0;
        int taskTime = 0;

        time = 240 - time;
        while (true) {
            taskTime += counter * 5;
            if (taskTime > time) {
                System.out.println(counter - 1);
                return;
            }
            if (counter == numberOfTasks) break;
            counter++;
        }
        System.out.println(numberOfTasks);
    }
}
