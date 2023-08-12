package OldTasks;

import java.util.Scanner;

public class Task0243_CF1207A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            int bread = in.nextInt() / 2;
            int beef = in.nextInt();
            int chicken = in.nextInt();
            int priceB = in.nextInt();
            int priceC = in.nextInt();
            System.out.println(priceB >= priceC
                    ? (Math.min(beef, bread) * priceB) + (Math.min(chicken, bread - Math.min(beef, bread)) * priceC)
                    : (Math.min(chicken, bread) * priceC) + (Math.min(beef, bread - Math.min(chicken, bread)) * priceB));
        }
    }
}
