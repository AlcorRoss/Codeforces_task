package OldTasks;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class Task0103_CF1641A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            int numberOfValues = in.nextInt();
            long multiplier = in.nextLong();
            int temp;
            TreeMap<Long, Integer> values = new TreeMap<>(Collections.reverseOrder());

            while (numberOfValues-- > 0) values.merge(in.nextLong(), 1, Integer::sum);
            for (Long key : values.keySet()) {
                if (key % multiplier == 0 && values.containsKey(key / multiplier) && values.get(key / multiplier) != 0) {
                    temp = Math.min(values.get(key), values.get(key / multiplier));
                    values.put(key, values.get(key) - temp);
                    values.put(key / multiplier, values.get(key / multiplier) - temp);
                }
            }
            temp = 0;
            for (Long key : values.keySet()) if (values.get(key) != 0) temp += values.get(key);
            System.out.println(temp);
        }
    }
}
