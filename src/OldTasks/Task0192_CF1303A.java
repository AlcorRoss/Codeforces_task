package OldTasks;

import java.util.Scanner;

public class Task0192_CF1303A {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int numberOfTests = scanner.nextInt();

        while (numberOfTests-- > 0) {
            int counter = 0;
            boolean oneFlag = false;
            char[] values = scanner.next().toCharArray();
            for (int i = 0; i < values.length; i++) {
                if (values[i] == '1') break;
                values[i] = '1';
            }
            for (int i = values.length - 1; i >= 0; i--) {
                if (values[i] == '1') break;
                values[i] = '1';
            }
            for (char value : values) {
                if (value == '1') oneFlag = true;
                if (oneFlag && value == '0') counter++;
            }
            System.out.println(counter);
        }
    }
}
