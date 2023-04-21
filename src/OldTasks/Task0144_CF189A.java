package OldTasks;

import java.util.Scanner;

public class Task0144_CF189A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int lengthA = in.nextInt();
        int lengthB = in.nextInt();
        int lengthC = in.nextInt();
        int max = 0;

        for (int i = 0; lengthA * i <= length; i++) {
            for (int j = 0; lengthB * j + lengthA * i <= length; j++) {
                int k = (length - (lengthA * i + lengthB * j)) / lengthC;
                if ((lengthA * i + lengthB * j + lengthC * k) == length) max = Math.max(max, i + j + k);
            }
        }
        System.out.println(max);
    }
}
