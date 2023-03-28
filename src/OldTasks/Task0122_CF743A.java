package OldTasks;

import java.util.Scanner;

public class Task0122_CF743A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        int start = in.nextInt() - 1;
        int finish = in.nextInt() - 1;
        String line = in.next();

        if (start == finish || line.charAt(start) == line.charAt(finish)) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
