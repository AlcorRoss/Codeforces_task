package OldTasks;

import java.util.Scanner;

public class Task0048 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            int numberOfValues = in.nextInt();
            int oldValue = in.nextInt(), currentValue;
            int sum = oldValue;
            boolean flag = false, flag2 = true;

            for (int j = 0; j < numberOfValues - 1; j++) {
                currentValue = in.nextInt();
                if (currentValue == -1 && oldValue == -1) flag = true;
                sum += currentValue;
                if (oldValue < 0 || currentValue < 0) flag2 = false;
                oldValue = currentValue;
            }

            if (flag) {
                System.out.println(sum + 4);
            } else if (flag2) {
                System.out.println(sum - 4);
            } else {
                System.out.println(sum);
            }

        }
    }
}
