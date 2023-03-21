package OldTasks;

import java.util.Scanner;

public class Task0117_CF1185B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            String purpose = in.next();
            String line = in.next();
            int index = 0;
            boolean flag = false;

            for (char c : line.toCharArray()) {
                if (index < purpose.length() && c == purpose.charAt(index)) {
                    index++;
                } else if (index == 0 || c != purpose.charAt(index - 1)) {
                    flag = true;
                    break;
                }
            }
            if (index == purpose.length() && !flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
