package OldTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task0221_CF1196A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int numberOFTest = in.nextInt();

        while (numberOFTest-- > 0) {
            var values = new long[3];
            for (int i = 0; i < 3; i++) values[i] = in.nextLong();
            Arrays.sort(values);
            var dif = values[1] - values[0];
            if (dif >= values[2]) System.out.println(values[0] + values[2]);
            else System.out.println(values[0] + dif + ((values[2] - dif)) / 2);
        }
    }
}
