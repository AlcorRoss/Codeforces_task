package OldTasks;

import java.util.Scanner;
import java.util.stream.Stream;

public class Task0244_CF1146A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        var line = in.next();
        var result = Stream.of(line.split("")).filter(s -> s.equals("a")).mapToInt(s -> 1).sum();
        System.out.println(Math.min(line.length(), result * 2 - 1));
    }
}
