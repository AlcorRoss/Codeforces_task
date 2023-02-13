package OldTasks;

import java.util.Scanner;

public class Task0049 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = "codeforces";
        char[] array = line.toCharArray();
        String temp;
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            boolean flag = false;
            temp = in.next();

            for (char c : array) {
                if (temp.charAt(0) == c) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
