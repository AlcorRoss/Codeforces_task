package OldTasks;

import java.util.*;

public class Task0237_CF988A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int numberOfValues = in.nextInt();
        int teamSize = in.nextInt();
        Set<Integer> tempSet = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= numberOfValues; i++) {
            int temp = in.nextInt();
            if (tempSet.contains(temp)) continue;
            else tempSet.add(temp);
            result.add(i);
        }
        if (result.size() < teamSize) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            for (int i = 0; i < teamSize; i++) System.out.print(result.get(i) + " ");
        }
    }
}
