package OldTasks;

import java.util.Scanner;

public class Task0128_CF828A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfValues = in.nextInt();
        int singleTable = in.nextInt();
        int doubleTable = in.nextInt();
        int temp = 0, result = 0;

        while (numberOfValues-- > 0) {
            switch (in.nextInt()) {
                case 1 -> {
                    if (singleTable > 0) {
                        singleTable--;
                    } else if (doubleTable > 0) {
                        doubleTable--;
                        temp++;
                    } else if (temp > 0) {
                        temp--;
                    } else {
                        result++;
                    }
                }
                case 2 -> {
                    if (doubleTable == 0) result += 2;
                    else doubleTable--;
                }
            }
        }
        System.out.println(result);
    }
}
