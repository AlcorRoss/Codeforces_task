package OldTasks;

import java.util.Scanner;

public class Task0051 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            int lengthAfter = in.nextInt();
            String line = in.next();

            if (lengthAfter == 0) {
                System.out.println(0);
                continue;
            }

            while (true) {
                if (line.length() < 2 || line.substring(0, 1).equals(line.substring(line.length() - 1))) {
                    break;
                } else {
                    line = line.substring(1);
                    line = line.substring(0, line.length() - 1);
                }
            }

            System.out.println(line.length());
        }
    }
}
