package OldTasks;

import java.util.Scanner;

public class Task0160_CF231A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();
        int result = 0;
        while (numberOfTests-- > 0) {
            int temp = 0;
            for (int i = 0; i < 3; i++) temp += in.nextInt();
            if (temp > 1) result++;
        }
        System.out.println(result);
    }
}
