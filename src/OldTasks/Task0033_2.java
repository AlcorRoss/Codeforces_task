package OldTasks;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task0033_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Integer, Integer> tempMap = new HashMap<>();
        int numberOfStudents, temp, maxOfIdenticalSkills;

        int numberOfTests = in.nextInt();
        int[] results = new int[numberOfTests];

        for (int i = 0; i < numberOfTests; i++) {
            numberOfStudents = in.nextInt();

            for (int j = 0; j < numberOfStudents; j++) {
                temp = in.nextInt();

                if (tempMap.containsKey(temp)) {
                    tempMap.put(temp, tempMap.get(temp) + 1);
                } else {
                    tempMap.put(temp, 1);
                }
            }

            maxOfIdenticalSkills = Collections.max(tempMap.values());

            if (maxOfIdenticalSkills - 1 >= tempMap.size()) {
                results[i] = tempMap.size();
            } else if (maxOfIdenticalSkills <= tempMap.size() - 1) {
                results[i] = maxOfIdenticalSkills;
            } else {
                results[i] = maxOfIdenticalSkills - 1;
            }

            tempMap.clear();
        }

        for (int result : results) {
            System.out.println(result);
        }
    }
}
