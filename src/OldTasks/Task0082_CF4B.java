package OldTasks;

import java.util.Scanner;

public class Task0082_CF4B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfDays = in.nextInt();
        int sumTime = in.nextInt();
        int[] min = new int[numberOfDays];
        int[] max = new int[numberOfDays];
        int temp = 0, temp2;
        boolean flag = false;

        for (int i = 0; i < numberOfDays; i++) {
            min[i] = in.nextInt();
            max[i] = in.nextInt();
            temp += max[i];
        }
        if (temp < sumTime) {
            System.out.println("NO");
        } else if (temp == sumTime) {
            System.out.println("YES");
            for (int value : max) System.out.print(value + " ");
        } else {
            temp -= sumTime;
            for (int i = 0; i < max.length; i++) {
                temp2 = max[i] - min[i];
                if (temp > temp2) {
                    temp -= temp2;
                    max[i] = min[i];
                } else if (temp < temp2) {
                    max[i] = min[i] + temp2 - temp;
                    flag = true;
                    break;
                } else {
                    max[i] = min[i];
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("YES");
                for (int value : max) System.out.print(value + " ");
            } else {
                System.out.println("NO");
            }
        }
    }
}
