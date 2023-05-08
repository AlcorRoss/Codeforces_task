package OldTasks;

import java.util.*;

public class Task0162_CF112A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line1 = in.nextLine().toLowerCase();
        String line2 = in.nextLine().toLowerCase();

        var i = line1.compareTo(line2);
        if (i > 0) System.out.println(1);
        else if (i < 0) System.out.println(-1);
        else System.out.println(0);

    }
}
