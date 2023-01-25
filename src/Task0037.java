import java.util.Scanner;

public class Task0037 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long multiplierA, multiplierB, limitA, limitB, quantityOfSteps, minA, minB, rangeA, rangeB;
        int numberOfTests = in.nextInt();
        long[] results = new long[numberOfTests];

        for (int i = 0; i < numberOfTests; i++) {

            multiplierA = in.nextInt();
            multiplierB = in.nextInt();
            limitA = in.nextInt();
            limitB = in.nextInt();
            quantityOfSteps = in.nextInt();

            rangeA = multiplierA - limitA;
            rangeB = multiplierB - limitB;

            minA = Math.max(multiplierA - quantityOfSteps, multiplierA - rangeA);
            minB = Math.max(multiplierB - quantityOfSteps, multiplierB - rangeB);

            if (minA <= minB) {
                minB = Math.max(multiplierB - Math.max(quantityOfSteps - rangeA, 0), multiplierB - rangeB);
            } else {
                minA = Math.max(multiplierA - Math.max(quantityOfSteps - rangeB, 0), multiplierA - rangeA);
            }

            results[i] = minA * minB;
        }

        for (long result : results) {
            System.out.println(result);
        }
    }
}
