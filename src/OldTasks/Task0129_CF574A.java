package OldTasks;

import java.util.*;

public class Task0129_CF574A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfValues = in.nextInt();
        List<Integer> values = new ArrayList<>();
        int purpose = in.nextInt(), temp, result = 0;

        while (numberOfValues-- > 1) {
            temp = in.nextInt();
            if (temp >= purpose) values.add(temp);
        }
        if (values.size() == 0) {
            System.out.println(result);
            return;
        }
        temp = Collections.max(values);
        while (temp >= purpose) {
            purpose++;
            result++;
            values.set(values.indexOf(temp), temp - 1);
            temp = Collections.max(values);
        }
        System.out.println(result);
    }
}
