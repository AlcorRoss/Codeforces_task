package OldTasks;

import java.util.*;

public class Task0121_CF1277B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            int numberOfValues = in.nextInt();
            int temp, counter = 0;
            TreeSet<Integer> values = new TreeSet<>();

            while (numberOfValues-- > 0) if ((temp = in.nextInt()) % 2 == 0) values.add(temp);
            if (values.size() == 0) {
                System.out.println(0);
                continue;
            }
            while (values.size() > 0) {
                temp = values.last();
                values.remove(temp);
                temp /= 2;
                counter++;
                if (temp % 2 == 0) values.add(temp);
            }
            System.out.println(counter);
        }
    }
}
