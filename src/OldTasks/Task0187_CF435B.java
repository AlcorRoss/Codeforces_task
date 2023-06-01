package OldTasks;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task0187_CF435B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] chars = in.next().toCharArray();
        int steps = in.nextInt();
        List<Integer> value = new LinkedList<>();
        int counter = 0;

        if (steps == 0) {
            System.out.println(String.valueOf(chars));
            return;
        }
        for (char aChar : chars) value.add(Integer.parseInt(String.valueOf(aChar)));
        while (steps > 0) {
            int max = Integer.MIN_VALUE;
            int maxIndex = -1;
            for (int i = counter; i < Math.min(steps + counter + 1, value.size()); i++) {
                if (value.get(i) > max) {
                    max = value.get(i);
                    maxIndex = i;
                }
            }
            if (maxIndex == -1) {
                counter++;
                continue;
            }
            value.remove(maxIndex);
            value.add(counter, max);
            maxIndex -= counter;
            steps -= maxIndex;
            counter++;
            if (counter == value.size()) break;
        }
        for (Integer integer : value) {
            System.out.print(integer);
        }
    }
}
