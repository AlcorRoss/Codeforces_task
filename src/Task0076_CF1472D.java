import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task0076_CF1472D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            int numberOfValues = in.nextInt();
            int counterBob = 0, counterAlice = 0;
            Integer[] values = new Integer[numberOfValues];

            for (int i = 0; i < numberOfValues; i++) {
                values[i] = in.nextInt();
            }
            Arrays.sort(values, Collections.reverseOrder());

            for (int i = 0; i < numberOfValues; i++) {
                if (i % 2 == 0) {
                    if (values[i] % 2 == 0) counterAlice += values[i];
                } else {
                    if (values[i] % 2 != 0) counterBob += values[i];
                }
            }

            if (counterAlice > counterBob) {
                System.out.println("Alice");
            } else if (counterBob > counterAlice) {
                System.out.println("Bob");
            } else {
                System.out.println("Tie");
            }
        }
    }
}
