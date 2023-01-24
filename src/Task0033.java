import java.util.*;

public class Task0033 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<Integer> tempSet = new HashSet<>();
        int numberOfStudents, temp;

        int numberOfTests = in.nextInt();
        int[] results = new int[numberOfTests];

        for (int i = 0; i < numberOfTests; i++) {
            numberOfStudents = in.nextInt();
            Integer[] tempArray = new Integer[numberOfStudents + 1];
            Arrays.fill(tempArray, 0);

            for (int j = 0; j < numberOfStudents; j++) {
                temp = in.nextInt();
                tempSet.add(temp);
                tempArray[temp]++;
            }

            Arrays.sort(tempArray, Collections.reverseOrder());

            if (tempArray[0] - 1 >= tempSet.size()) {
                results[i] = tempSet.size();
            } else if (tempArray[0] <= tempSet.size() - 1) {
                results[i] = tempArray[0];
            } else {
                results[i] = tempArray[0] - 1;
            }

            tempSet.clear();
        }

        for (int result : results) {
            System.out.println(result);
        }
    }
}

