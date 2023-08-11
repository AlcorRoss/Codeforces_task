package OldTasks;

import java.util.Scanner;

public class Task0242_CF1814A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            long purpose = in.nextLong();
            long cost = in.nextLong();
            System.out.println(((purpose - cost) % 2 == 0 || (purpose - (2 * cost)) % 2 == 0) ? "YES" : "NO");
        }
    }
}
