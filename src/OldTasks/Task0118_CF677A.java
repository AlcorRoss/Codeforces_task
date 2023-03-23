package OldTasks;

import java.util.Scanner;

public class Task0118_CF677A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfValues = in.nextInt();
        int height = in.nextInt();
        int counter = 0;
        while (numberOfValues-- > 0) {
            if (in.nextInt() > height) counter += 2;
            else counter++;
        }
        System.out.println(counter);
    }
}
