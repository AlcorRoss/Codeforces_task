package OldTasks;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Task0264_CF919A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfValues = in.nextInt();
        int purpose = in.nextInt();
        IntStream.range(0, numberOfValues)
                .mapToDouble(val -> in.nextDouble() / in.nextDouble())
                .sorted()
                .findFirst()
                .ifPresent(val -> System.out.println(val * purpose));
    }
}
