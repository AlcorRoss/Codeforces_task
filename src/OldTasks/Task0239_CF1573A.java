package OldTasks;

import java.util.Scanner;
import java.util.stream.Stream;

public class Task0239_CF1573A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            in.nextInt();
            var list = Stream.of(in.next().split("")).map(Integer::parseInt).toList();
            var result = list.stream().mapToInt(Integer::intValue).sum();
            for (int i = 0; i < list.size(); i++) if (list.get(i) != 0 && i != list.size() - 1) result++;
            System.out.println(result);
        }
    }
}
