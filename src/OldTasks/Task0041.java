package OldTasks;

import java.util.Scanner;

public class Task0041 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result_1, result_2;
        int numberOfTrips = in.nextInt();
        int seasonPass = in.nextInt();
        int priceOfTrip = in.nextInt();
        int priceOfSeasonPass = in.nextInt();

        if (priceOfTrip <= (double) priceOfSeasonPass / seasonPass) {
            System.out.println(numberOfTrips * priceOfTrip);
        } else {
            result_1 = (numberOfTrips / seasonPass * priceOfSeasonPass) + (numberOfTrips % seasonPass * priceOfTrip);
            result_2 = ((numberOfTrips / seasonPass) + 1) * priceOfSeasonPass;
            System.out.println(Math.min(result_1, result_2));
        }
    }
}
