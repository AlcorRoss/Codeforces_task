package OldTasks;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Task0252_CF22A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        var values = IntStream.range(0, in.nextInt()).map(val -> in.nextInt()).sorted().boxed().toList();
        values.stream().filter(val -> val > values.get(0)).findFirst()
                .ifPresentOrElse(System.out::println, () -> System.out.println("NO"));
    }
}
