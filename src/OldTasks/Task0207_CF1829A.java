package OldTasks;

import java.util.Scanner;

public class Task0207_CF1829A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        String purpose = "codeforces";
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            String line = in.next();
            int result = 0;
            for (int i = 0; i < line.length(); i++) if (line.charAt(i) != purpose.charAt(i)) result++;
            System.out.println(result);
        }
    }
}
