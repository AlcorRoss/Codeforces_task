package OldTasks;

import java.util.Scanner;

public class Task0234_CF1206A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int val1 = 0, val2 = 0;
        int numberOfValues = in.nextInt();
        while (numberOfValues-- > 0) val1 = Math.max(val1, in.nextInt());
        numberOfValues = in.nextInt();
        while (numberOfValues-- > 0) val2 = Math.max(val2, in.nextInt());
        System.out.println(val1 + " " + val2);
    }
}
