package Task0023;

import java.util.Scanner;

public class Task23_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] groups = new int[n];

        for (int i = 0; i < n; i++) {
            groups[i] = in.nextInt();
        }

        calculate(groups);
    }

    public static void calculate(int[] groups) {
        int counter_1 = 0, counter_2 = 0, counter_3 = 0, counter_4 = 0, result_1, result_2, result_3 = 0, totalResult;

        for (int group : groups) {
            switch (group) {
                case (1) -> counter_1++;
                case (2) -> counter_2++;
                case (3) -> counter_3++;
                case (4) -> counter_4++;
            }
        }

        if (counter_1 == counter_3) {
            result_1 = counter_1;
            counter_1 = counter_3 = 0;
        } else if (counter_1 > counter_3) {
            result_1 = counter_3;
            counter_1 -= counter_3;
            counter_3 = 0;
        } else {
            result_1 = counter_1;
            counter_3 -= counter_1;
            counter_1 = 0;
        }

        if (counter_2 % 2 == 0) {
            result_2 = counter_2 / 2;
            counter_2 = 0;
        } else {
            result_2 = counter_2 / 2;
            counter_2 = 1;
        }

        if (counter_1 != 0 && counter_2 != 0) {
            result_3 = 1;
            counter_1 -= 2;
            counter_2 = 0;
        }

        if (counter_1 <= 0) {
            counter_1 = 0;
        } else if (counter_1 % 4 == 0) {
            counter_1 /= 4;
        } else {
            counter_1 = counter_1 / 4 + 1;
        }

        totalResult = counter_1 + counter_2 + counter_3 + counter_4 + result_1 + result_2 + result_3;
        System.out.println(totalResult);
    }
}

