package OldTasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task0108_CF998B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfValues = in.nextInt();
        int priceLimit = in.nextInt();
        int[] values = new int[numberOfValues];
        int odd = 0, even = 0, temp = 0, result = 0;
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < values.length; i++) values[i] = in.nextInt();
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] % 2 == 0) even++;
            else odd++;
            if (odd == even) resultList.add(Math.abs(values[i] - values[i + 1]));
        }
        Collections.sort(resultList);
        for (Integer value : resultList) {
            if (value + temp <= priceLimit) {
                result++;
                temp += value;
            } else {
                break;
            }
        }
        System.out.println(result);
    }
}
