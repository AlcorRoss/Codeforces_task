package OldTasks;

import java.util.Scanner;

public class Task0102_CF454B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfValue = in.nextInt();
        int[] values = new int[numberOfValue];
        int min = Integer.MAX_VALUE, minIndex = 0, counter = 0, temp = 0, temp1;
        boolean flag = false, flag2 = false;

        for (int i = 0; i < values.length; i++) {
            values[i] = in.nextInt();
            min = Math.min(min, values[i]);
        }
        for (int value : values) {
            if (value == min) temp++;
            else flag2 = true;
        }
        temp1 = temp;
        if (temp > 1) {
            for (int i = values.length - 1; i >= 0; i--) {
                if (values[i] == min) {
                    temp--;
                    flag = true;
                } else if (flag) {
                    minIndex = i + 1;
                    break;
                }
            }
            if (temp > 0) {
                for (int value : values) {
                    if (value == min) {
                        temp--;
                        flag = false;
                    } else if (!flag) break;
                }
            }
            if (temp > 0) {
                System.out.println(-1);
                return;
            }
        } else {
            for (int i = 0; i < values.length; i++) {
                if (values[i] == min) {
                    minIndex = i;
                    break;
                }
            }
        }
        if (values[0] != min || temp1 > 1 && flag2) {
            for (int i = minIndex; i < values.length; i++) {
                if (min > values[i]) {
                    System.out.println(-1);
                    return;
                }
                min = values[i];
                counter++;
            }
            for (int i = 0; i < minIndex; i++) {
                if (min > values[i]) {
                    System.out.println(-1);
                    return;
                }
                min = values[i];
            }
        } else {
            for (int value : values) {
                if (min > value) {
                    System.out.println(-1);
                    return;
                }
                min = value;
            }
        }
        System.out.println(counter);
    }
}
