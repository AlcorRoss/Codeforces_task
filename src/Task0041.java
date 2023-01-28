import java.util.Scanner;

public class Task0041 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result, result_1;
        int numberOfTrips = in.nextInt();
        int seasonPass = in.nextInt();
        int priceOfTrip = in.nextInt();
        int priceOfSeasonPass = in.nextInt();

        if (priceOfTrip <= (double) priceOfSeasonPass / seasonPass) {
            System.out.println(numberOfTrips * priceOfTrip);
        } else {
            result = numberOfTrips / seasonPass * priceOfSeasonPass;
            result_1 = numberOfTrips % seasonPass * priceOfTrip;
            System.out.println(result + result_1);
        }
    }
}
