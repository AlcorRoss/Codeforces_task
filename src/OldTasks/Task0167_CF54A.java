package OldTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task0167_CF54A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfDays = in.nextInt();
        int steps = in.nextInt();
        int numberOfValues = in.nextInt();
        int prev = 0, temp;
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < numberOfValues; i++) {
            temp = in.nextInt();
            if ((temp - prev) % steps == 0) resultList.add((temp - prev) / steps);
            else resultList.add(((temp - prev) / steps) + 1);
            prev = temp;
        }
        if (steps == 1) {
            System.out.println(numberOfDays);
        } else {
            resultList.add((numberOfDays - prev) / steps);
            System.out.println(resultList.stream().reduce(Integer::sum).get());
        }
    }
}
