package OldTasks;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Task0253_CF746A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] delimiter = {1, 2, 4};
        IntStream.range(0, 3)
                .map(val -> in.nextInt() / delimiter[val])
                .sorted()
                .findFirst()
                .ifPresent(val -> System.out.println(val + val * delimiter[1] + val * delimiter[2])
                );
    }
}
