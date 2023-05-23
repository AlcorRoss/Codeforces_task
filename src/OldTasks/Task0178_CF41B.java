package OldTasks;

import java.util.*;

public class Task0178_CF41B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfDays = in.nextInt();
        int balance = in.nextInt();
        int max = Integer.MIN_VALUE;
        int[] rates = new int[numberOfDays];

        for (int i = 0; i < numberOfDays; i++) rates[i] = in.nextInt();
        for (int i = 0; i < rates.length - 1; i++) {
            if (rates[i] <= balance) {
                for (int j = i + 1; j < rates.length; j++) {
                    int temp = balance / rates[i];
                    max = Math.max(max, (temp * rates[j]) + (balance % rates[i]));
                }
            }
        }
        System.out.println(Math.max(balance, max));
    }
}
