package OldTasks;

import java.util.Scanner;

public class Task0236_CF1492A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int numberOfValues = in.nextInt();

        while (numberOfValues-- > 0) {
            long purpose = in.nextLong();
            long result = Long.MAX_VALUE;
            for (int i = 0; i < 3; i++) {
                long temp = in.nextLong();
                if (purpose % temp == 0) result = 0;
                else result = Math.min(result, (((purpose / temp) + 1) * temp) - purpose);
            }
            System.out.println(result);
        }
    }
}
