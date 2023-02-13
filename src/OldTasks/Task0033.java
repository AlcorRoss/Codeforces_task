package OldTasks;

import java.util.*;

public class Task0033 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<Integer> tempSet = new HashSet<>();
        int numberOfStudents, temp, maxOfIdenticalSkills = 0;

        int numberOfTests = in.nextInt();
        int[] results = new int[numberOfTests];

        for (int i = 0; i < numberOfTests; i++) {
            numberOfStudents = in.nextInt();
            int[] tempArray = new int[numberOfStudents + 1];

            for (int j = 0; j < numberOfStudents; j++) {
                temp = in.nextInt();
                tempSet.add(temp);
                tempArray[temp]++;
            }

            for (int skill : tempArray) {
                if (skill > maxOfIdenticalSkills) maxOfIdenticalSkills = skill;
            }

            if (maxOfIdenticalSkills - 1 >= tempSet.size()) {
                results[i] = tempSet.size();
            } else if (maxOfIdenticalSkills <= tempSet.size() - 1) {
                results[i] = maxOfIdenticalSkills;
            } else {
                results[i] = maxOfIdenticalSkills - 1;
            }

            tempSet.clear();
            maxOfIdenticalSkills = 0;
        }

        for (int result : results) {
            System.out.println(result);
        }
    }
}

