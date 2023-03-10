package OldTasks;

import java.util.Scanner;

public class Task0061 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTest = in.nextInt();

        for (int i = 0; i < numberOfTest; i++) {
            boolean flag = true;
            long numberOfTwo = 0;
            int numberOfValues = in.nextInt();
            long[] values = new long[numberOfValues];
            long[] tempFromBegin = new long[numberOfValues];
            long[] tempFromEnd = new long[numberOfValues];

            for (int j = 0; j < numberOfValues; j++) {
                values[j] = in.nextInt();
                if (values[j] == 2) numberOfTwo++;
            }

            if (numberOfTwo % 2 != 0) {
                System.out.println(-1);
                continue;
            }

            tempFromBegin[0] = values[0];
            tempFromEnd[tempFromEnd.length - 1] = values[values.length - 1];

            for (int j = 1; j < tempFromBegin.length; j++) {
                tempFromBegin[j] = values[j] * tempFromBegin[j - 1];
            }

            for (int j = tempFromEnd.length - 2; j >= 0; j--) {
                tempFromEnd[j] = values[j] * tempFromEnd[j + 1];
            }

            for (int j = 0; j < tempFromBegin.length - 1; j++) {
                if (tempFromBegin[j] == tempFromEnd[j + 1]) {
                    System.out.println(j + 1);
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.println(-1);
        }
    }
}













