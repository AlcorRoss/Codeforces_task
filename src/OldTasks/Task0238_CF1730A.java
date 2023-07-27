package OldTasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task0238_CF1730A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            Map<Integer, Integer> planets = new HashMap<>();
            int result = 0;
            int numberOfPlanets = in.nextInt();
            int cost = in.nextInt();
            while (numberOfPlanets-- > 0) planets.merge(in.nextInt(), 1, Integer::sum);
            for (Integer value : planets.values()) result += Math.min(value, cost);
            System.out.println(result);
        }
    }
}
