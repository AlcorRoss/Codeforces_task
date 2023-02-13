package OldTasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task0044_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Integer, Integer> memorizationMap = new HashMap<>();
        int numberOfTests, temp, tempMem;
        int numberOfBox = in.nextInt();
        int[] boxes = new int[numberOfBox + 1];

        for (int i = 1; i < boxes.length; i++) {
            boxes[i] = in.nextInt();
        }

        numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            temp = in.nextInt();

            if (memorizationMap.containsKey(temp)) {
                System.out.println(memorizationMap.get(temp));
                continue;
            }

            tempMem = temp;

            for (int j = 1; j < boxes.length; j++) {
                temp -= boxes[j];
                if (temp <= 0) {
                    System.out.println(j);
                    memorizationMap.put(tempMem, j);
                    break;
                }
            }
        }
    }
}
