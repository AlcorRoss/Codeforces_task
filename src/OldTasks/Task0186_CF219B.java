package OldTasks;

import java.util.Scanner;

public class Task0186_CF219B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long price = in.nextLong();
        long discount = in.nextLong();
        long result = ++price;
        long temp = 10;

        while (price % temp <= discount) {
            result = price - price % temp;
            temp *= 10;
        }
        System.out.println(result - 1);
    }
}
