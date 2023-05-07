package OldTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task0161_CF493B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfValues = in.nextInt();
        long sum1 = 0, sum2 = 0;
        int temp;
        String result = null;
        List<Integer> values1 = new ArrayList<>();
        List<Integer> values2 = new ArrayList<>();

        while (numberOfValues-- > 0) {
            temp = in.nextInt();
            if (numberOfValues == 0) {
                if (temp > 0) result = "first";
                else result = "second";
            }
            if (temp > 0) {
                values1.add(temp);
                sum1 += temp;
            } else {
                values2.add(Math.abs(temp));
                sum2 += Math.abs(temp);
            }
        }
        if (sum1 > sum2) {
            System.out.println("first");
            return;
        } else if (sum2 > sum1) {
            System.out.println("second");
            return;
        }
        for (int i = 0; i < Math.min(values1.size(), values2.size()); i++) {
            if (values1.get(i) > values2.get(i)) {
                System.out.println("first");
                return;
            } else if (values1.get(i) < values2.get(i)) {
                System.out.println("second");
                return;
            }
        }
        if (values1.size() > values2.size()) {
            System.out.println("first");
        } else if (values2.size() > values1.size()) {
            System.out.println("second");
        } else {
            System.out.println(result);
        }
    }
}
