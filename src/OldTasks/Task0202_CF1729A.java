package OldTasks;

import java.util.Scanner;

public class Task0202_CF1729A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int numberOfValues = in.nextInt();

        while (numberOfValues-- > 0) {
            int positionElevator1 = in.nextInt();
            int positionElevator2 = in.nextInt();
            int purposeElevator2 = in.nextInt();
            int time = positionElevator1 - 1;
            int time2 = Math.abs(positionElevator2 - purposeElevator2);
            time2 += purposeElevator2 - 1;
            if (time < time2) System.out.println(1);
            else if (time > time2) System.out.println(2);
            else System.out.println(3);
        }
    }
}
