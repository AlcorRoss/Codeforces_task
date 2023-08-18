package OldTasks;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Task0248_CF1615A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        var numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            int numberOfValues = in.nextInt();
            var sum = IntStream.range(0, numberOfValues).map(value -> in.nextInt()).sum();
            System.out.println(sum % numberOfValues == 0 ? 0 : 1);
        }
    }
}
