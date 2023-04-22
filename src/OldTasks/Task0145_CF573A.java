package OldTasks;

import java.util.Scanner;
import java.util.TreeSet;

public class Task0145_CF573A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfValues = in.nextInt();
        int min;
        TreeSet<Integer> values = new TreeSet<>();

        while (numberOfValues-- > 0) values.add(in.nextInt());
        min = values.first();
        values.remove(min);
        while (min % 2 == 0 || min % 3 == 0) {
            if (min % 2 == 0) min /= 2;
            if (min % 3 == 0) min /= 3;
        }
        for (Integer value : values) {
            while (value % 2 == 0 || value % 3 == 0) {
                if (value % 2 == 0) value /= 2;
                if (value % 3 == 0) value /= 3;
            }
            if (value != min) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
