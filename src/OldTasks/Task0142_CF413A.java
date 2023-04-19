package OldTasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task0142_CF413A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int purpose = in.nextInt();
        int numberOfValues = in.nextInt();
        int min = in.nextInt();
        int max = in.nextInt();
        List<Integer> values = new ArrayList<>();

        for (int i = 0; i < numberOfValues; i++) values.add(in.nextInt());
        if (purpose - numberOfValues >= 2 && Collections.max(values) <= max && Collections.min(values) >= min) {
            System.out.println("Correct");
        } else if (purpose - numberOfValues < 2 && Collections.max(values) == max && Collections.min(values) >= min
                || purpose - numberOfValues < 2 && Collections.max(values) <= max && Collections.min(values) == min) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
    }
}
