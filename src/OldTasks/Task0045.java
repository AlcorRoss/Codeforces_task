package OldTasks;

import java.util.Scanner;

public class Task0045 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0, indexMax = 0, indexMin = 0, indexMaxReverse = 0, indexMinReverse = 0,
                tempMax = Integer.MIN_VALUE, tempMin = Integer.MAX_VALUE, result = 0;
        boolean flag = true;
        int[] values = new int[in.nextInt()];
        int[] sumFromBegin = new int[values.length];
        int[] sumFromEnd = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            values[i] = in.nextInt();
            if (values[i] == 0) flag = false;
        }

        if (values.length == 1 && values[0] == 1) {
            System.out.println(0);
        } else if (values.length == 1 && values[0] == 0) {
            System.out.println(1);
        } else if (flag) {
            System.out.println(values.length - 1);
        } else {
            for (int i = 0; i < sumFromBegin.length; i++) {
                if (values[i] == 0) {
                    sum += 1;
                } else {
                    sum -= 1;
                }
                sumFromBegin[i] = sum;

                if (sum > tempMax) {
                    tempMax = sum;
                    indexMax = i;
                }
            }

            for (int i = 0; i < indexMax; i++) {
                if (sumFromBegin[i] < tempMin) {
                    tempMin = sumFromBegin[i];
                    indexMin = i;
                }
            }

            sum = 0;
            tempMax = Integer.MIN_VALUE;
            tempMin = Integer.MAX_VALUE;

            for (int i = sumFromEnd.length - 1; i >= 0; i--) {
                if (values[i] == 0) {
                    sum += 1;
                } else {
                    sum -= 1;
                }
                sumFromEnd[i] = sum;

                if (sum > tempMax) {
                    tempMax = sum;
                    indexMaxReverse = i;
                }
            }

            for (int i = sumFromEnd.length - 1; i > indexMaxReverse; i--) {
                if (sumFromEnd[i] < tempMin) {
                    tempMin = sumFromEnd[i];
                    indexMinReverse = i;
                }
            }

            if (indexMaxReverse != indexMax) {

                for (int i = indexMaxReverse; i <= indexMax; i++) {
                    values[i] = 1 - values[i];
                }
            } else {
                for (int i = indexMin + 1; i < indexMinReverse; i++) {
                    values[i] = 1 - values[i];
                }
            }

            for (int i : values) {
                if (i == 1) result++;
            }

            System.out.println(result);
        }
    }
}
