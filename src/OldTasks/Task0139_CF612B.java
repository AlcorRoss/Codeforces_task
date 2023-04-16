package OldTasks;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task0139_CF612B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfValues = in.nextInt();
        Map<Integer, Integer> values = new TreeMap<>();
        long result = 0;
        int indexTemp;

        for (int i = 1; i <= numberOfValues; i++) values.put(in.nextInt(), i);
        indexTemp = values.get(1);
        values.remove(1);
        for (Map.Entry<Integer, Integer> entry : values.entrySet()) {
            result += Math.abs(entry.getValue() - indexTemp);
            indexTemp = entry.getValue();
        }
        System.out.println(result);
    }
}
