package OldTasks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Task0235_CF1614A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            var numberOfValues = in.nextInt();
            int min = in.nextInt();
            int max = in.nextInt();
            int balance = in.nextInt();
            int result = 0;
            List<Integer> values = new ArrayList<>();
            while (numberOfValues-- > 0) {
                int temp = in.nextInt();
                if (temp >= min && temp <= max) values.add(temp);
            }
            values.sort(Comparator.naturalOrder());
            for (Integer value : values) {
                balance -= value;
                if (balance < 0) break;
                result++;
            }
            System.out.println(result);
        }
    }
}
