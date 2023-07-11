package OldTasks;

import java.util.*;

public class Task0227_CF978A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int numberOfValues = in.nextInt();
        int[] values = new int[numberOfValues];
        Set<Integer> resultSet = new LinkedHashSet<>();

        for (int i = 0; i < numberOfValues; i++) values[i] = in.nextInt();
        for (int i = values.length - 1; i >= 0; i--) resultSet.add(values[i]);
        List<Integer> result = new ArrayList<>(resultSet);
        System.out.println(result.size());
        for (int i = result.size() - 1; i >= 0; i--) System.out.print(result.get(i) + " ");
    }
}
