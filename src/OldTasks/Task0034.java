package OldTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task0034 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arrayLength, temp;
        int numberOfTests = in.nextInt();
        String[] results = new String[numberOfTests];

        for (int i = 0; i < numberOfTests; i++) {
            arrayLength = in.nextInt();
            List<Integer> evenList = new ArrayList<>();
            List<Integer> oddList = new ArrayList<>();

            for (int j = 0; j < arrayLength; j++) {
                temp = in.nextInt();

                if (temp % 2 == 0) {
                    evenList.add(temp);
                } else {
                    oddList.add(temp);
                }
            }

            if (oddList.size() % 2 == 0 && evenList.size() % 2 == 0) {
                results[i] = "YES";
            } else if (oddList.size() % 2 == evenList.size() % 2) {
                results[i] = pairSearch(evenList, oddList);
            } else {
                results[i] = "NO";
            }

        }

        for (String result : results) {
            System.out.println(result);
        }
    }

    public static String pairSearch(List<Integer> even, List<Integer> odd) {
        if (even.size() > odd.size()) {
            for (int number : even) {
                for (int purpose : odd) {
                    if (Math.abs(number - purpose) == 1) return "YES";
                }
            }
        } else {
            for (int number : odd) {
                for (int purpose : even) {
                    if (Math.abs(number - purpose) == 1) return "YES";
                }
            }
        }

        return "NO";
    }
}
