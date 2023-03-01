package OldTasks;

import java.util.*;

public class Task0094_CF1133C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfStudents = in.nextInt();
        Map<Integer, Integer> studentSkill = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int max;

        while (numberOfStudents-- > 0) studentSkill.merge(in.nextInt(), 1, Integer::sum);
        for (var pair : studentSkill.entrySet()) {
            max = pair.getValue();
            for (int i = 1; i <= 5; i++)
                if (studentSkill.containsKey(pair.getKey() + i)) max += studentSkill.get(pair.getKey() + i);
            result.add(max);
        }
        System.out.println(Collections.max(result));
    }
}