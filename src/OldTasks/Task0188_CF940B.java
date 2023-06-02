package OldTasks;

import java.util.Scanner;

public class Task0188_CF940B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long value = in.nextLong();
        long divider = in.nextLong();
        long priceA = in.nextLong();
        long priceB = in.nextLong();
        long result = 0;

        if (divider <= 1) {
            result = (value - 1) * priceA;
            System.out.println(result);
            return;
        }
        while (value > 1) {
            if (value < divider) {
                result += (value - 1) * priceA;
                break;
            }
            result += (value % divider) * priceA;
            value -= value % divider;
            result += Math.min((value - (value / divider)) * priceA, priceB);
            value /= divider;
        }
        System.out.println(result);
    }
}
