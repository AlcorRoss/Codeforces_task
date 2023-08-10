package OldTasks;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Task0242_CF939A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int numberOfValues = in.nextInt();
        int[] values = new int[numberOfValues + 1];

        IntStream.rangeClosed(1, numberOfValues).forEach(index -> values[index] = in.nextInt());
        for (int i = 0; i < values.length; i++) {
            if (values[values[i]] != i && values[values[values[i]]] == i) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
