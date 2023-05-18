package OldTasks;

import java.util.Scanner;

public class Task0173_CF1214A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rub = in.nextInt();
        int dollarRate = in.nextInt();
        int euroRate = in.nextInt() * 5;
        int result = Integer.MAX_VALUE;

        for (int i = 0; i * euroRate <= rub; i++) result = Math.min(result, (rub - i * euroRate) % dollarRate);
        System.out.println(result);
    }
}
