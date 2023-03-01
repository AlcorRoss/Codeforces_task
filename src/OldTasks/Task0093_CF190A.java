package OldTasks;

import java.util.Scanner;

public class Task0093_CF190A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfAdults = in.nextInt();
        int numberOfKids = in.nextInt();
        int min, max;

        if (numberOfAdults == 0 && numberOfKids == 0) {
            System.out.println(0 + " " + 0);
            return;
        } else if (numberOfAdults == 0) {
            System.out.println("Impossible");
            return;
        }
        min = Math.max(numberOfAdults, numberOfKids);
        max = numberOfAdults + Math.max(numberOfKids - 1, 0);
        System.out.println(min + " " + max);
    }
}
