package OldTasks;

import java.util.Scanner;

public class Task0087_CF1789B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            in.nextInt();
            String line = in.next();
            char[] values = line.toCharArray();
            boolean flag1 = false, flag2 = false, flag3 = false, flag4;

            for (int i = 0; i < values.length - i; i++) {
                flag4 = values[i] != values[values.length - 1 - i];
                if (flag4 && !flag1) {
                    flag1 = true;
                    continue;
                }

                if (!flag4 && flag1 && !flag2) {
                    flag2 = true;
                    continue;
                }

                if (flag4 && flag2) {
                    flag3 = true;
                    break;
                }
            }

            if (flag3) System.out.println("No");
            else System.out.println("Yes");
        }
    }
}
