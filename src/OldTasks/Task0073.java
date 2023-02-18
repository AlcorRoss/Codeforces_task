package OldTasks;

import java.util.Scanner;

public class Task0073 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            boolean flag = false, flag2 = false, flag3 = false;
            int numberOfValues = in.nextInt();
            int purpose = in.nextInt();
            int temp, temp2;

            for (int j = 0; j < numberOfValues; j++) {
                temp = in.nextInt();
                temp2 = in.nextInt();
                if (temp == purpose && temp2 == purpose) flag = true;
                else if (temp == purpose) flag2 = true;
                else if (temp2 == purpose) flag3 = true;
            }

            if (flag || flag2 && flag3) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
