package OldTasks;

import java.util.*;

public class Task0208_CF1593A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            List<Integer> values = new ArrayList<>();
            for (int i = 0; i < 3; i++) values.add(in.nextInt());
            int win = Collections.max(values);
            int counter = 0;
            for (Integer value : values) if (value == win) counter++;
            if (counter > 1) {
                win++;
                System.out.println((win - values.get(0)) + " " + (win - values.get(1)) + " " + (win - values.get(2)));
            } else {
                for (Integer value : values) {
                    if (value == win) System.out.print(0 + " ");
                    else System.out.print(((win + 1) - value) + " ");
                }
                System.out.println();
            }
        }
    }
}
