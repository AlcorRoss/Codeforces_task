package OldTasks;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Task0253_CF1834A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        var numberOfTests = in.nextInt();
        while (numberOfTests-- > 0) {
            var numberOfValues = in.nextInt();
            var positive = IntStream.range(0, numberOfValues).map(val -> in.nextInt()).filter(val -> val > 0).sum();
            int negative = numberOfValues - positive;
            if (positive >= negative) {
                System.out.println(negative % 2 == 0 ? 0 : 1);
            } else {
                int dif = (negative - positive) / 2 + (negative - positive) % 2;
                negative -= dif;
                System.out.println(negative % 2 == 0 ? dif : dif + 1);
            }
        }
    }
}
