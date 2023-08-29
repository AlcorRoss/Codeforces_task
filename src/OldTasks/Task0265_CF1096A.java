package OldTasks;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Task0265_CF1096A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOFTests = in.nextInt();
        while (numberOFTests-- > 0) {
            IntStream.range(0, 2)
                    .map(val -> in.nextInt())
                    .sorted()
                    .findFirst().ifPresent(val -> System.out.println(val + " " + val * 2));
        }
    }
}
