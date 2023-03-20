package OldTasks;

import java.util.Scanner;

public class Task0116_CF1807D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            int arrayLength = in.nextInt();
            int numberOfRequest = in.nextInt();
            int[] array = new int[arrayLength];
            int[] sumFromOrigin = new int[arrayLength];
            int[] sumFromEnd = new int[arrayLength];
            int temp;

            for (int i = 0; i < arrayLength; i++) {
                temp = in.nextInt();
                if (temp % 2 == 0) array[i] = 0;
                else array[i] = 1;
            }
            sumFromOrigin[0] = array[0];
            sumFromEnd[sumFromEnd.length - 1] = array[array.length - 1];
            for (int i = 1; i < sumFromOrigin.length; i++) sumFromOrigin[i] = sumFromOrigin[i - 1] + array[i];
            for (int i = sumFromEnd.length - 2; i >= 0; i--) sumFromEnd[i] = sumFromEnd[i + 1] + array[i];
            while (numberOfRequest-- > 0) {
                int origin = in.nextInt() - 1;
                int bound = in.nextInt() - 1;
                int value = in.nextInt();
                int tempOr = 0, tempEnd = 0;
                int newSum = value * (bound - origin + 1);
                if (origin > 0) tempOr = sumFromOrigin[origin - 1];
                if (bound < array.length - 1) tempEnd = sumFromEnd[bound + 1];
                newSum += tempOr + tempEnd;
                if (newSum % 2 == 0) System.out.println("NO");
                else System.out.println("YES");
            }
        }
    }
}
