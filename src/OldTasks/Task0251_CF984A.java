package OldTasks;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Task0251_CF984A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        var numberOfValues = in.nextInt();
        var array = IntStream.range(0, numberOfValues).map(val -> in.nextInt()).sorted().toArray();
        System.out.println(array[numberOfValues % 2 == 0 ? (numberOfValues / 2) - 1 : (numberOfValues / 2)]);
    }
}
