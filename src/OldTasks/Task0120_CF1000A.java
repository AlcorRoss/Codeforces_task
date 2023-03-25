package OldTasks;

import java.util.*;

public class Task0120_CF1000A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfValues = in.nextInt();
        int result = 0;
        String temp;
        List<String> oldValues = new LinkedList<>();
        List<String> newValues = new ArrayList<>();

        for (int i = 0; i < numberOfValues; i++) oldValues.add(in.next());
        for (int i = 0; i < numberOfValues; i++) {
            temp = in.next();
            if (oldValues.contains(temp)) oldValues.remove(temp);
            else newValues.add(temp);
        }
        Collections.sort(oldValues);
        Collections.sort(newValues);
        for (int i = 0; i < newValues.size(); i++) {
            for (int j = 0; j < newValues.get(i).length(); j++)
                if (newValues.get(i).charAt(j) != oldValues.get(i).charAt(j)) result++;
        }
        System.out.println(result);
    }
}
