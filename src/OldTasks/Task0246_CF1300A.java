package OldTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Task0246_CF1300A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        var numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            List<Integer> values = new ArrayList<>();
            IntStream.range(0, in.nextInt()).forEach(value -> values.add(in.nextInt()));
            var result = values.stream().filter(value -> value == 0).count();
            var sum = values.stream().reduce(0, Integer::sum);
            System.out.println(result + sum != 0 ? result : result + 1);
        }
    }
}
