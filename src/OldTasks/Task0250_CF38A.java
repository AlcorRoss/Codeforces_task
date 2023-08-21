package OldTasks;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Task0250_CF38A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        var values = IntStream.range(1, in.nextInt()).map(value -> in.nextInt()).toArray();
        System.out.println(Arrays.stream(values, in.nextInt() - 1, in.nextInt() - 1).sum());
    }
}
