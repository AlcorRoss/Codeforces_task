package OldTasks;

import java.util.Scanner;

public class Task0215_CF1186A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int numberOfValues = in.nextInt();

        for (int i = 0; i < 2; i++) {
            if (numberOfValues > in.nextInt()) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
