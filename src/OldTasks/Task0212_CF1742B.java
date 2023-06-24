package OldTasks;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task0212_CF1742B {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int numberOfTest = in.nextInt();

        while (numberOfTest-- > 0) {
            int numberOfValue = in.nextInt();
            Set<Integer> values = new HashSet<>();
            for (int i = 0; i < numberOfValue; i++) values.add(in.nextInt());
            if (values.size() == numberOfValue) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
