package OldTasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task0044_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Integer, Integer> boxesMap = new HashMap<>();
        int temp, numberOfTests, counter = 1;
        int numberOfBox = in.nextInt();

        for (int i = 1; i < numberOfBox + 1; i++) {
            temp = in.nextInt();

            for (int j = 0; j < temp; j++) {
                boxesMap.put(counter, i);
                counter++;
            }
        }

        numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            System.out.println(boxesMap.get(in.nextInt()));
        }
    }
}
