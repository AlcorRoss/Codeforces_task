package OldTasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task0096_CF1800B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            in.nextInt();
            int steps = in.nextInt();
            int counter = 0, tempSteps;
            Map<Character, Integer> charMap = new HashMap<>();
            String line = in.next();
            char[] chars = line.toCharArray();
            char temp;

            for (char c : chars) {
                charMap.merge(c, 1, Integer::sum);
            }
            for (char c : charMap.keySet()) {
                if (Character.isUpperCase(c)) temp = Character.toLowerCase(c);
                else temp = Character.toUpperCase(c);
                if (charMap.containsKey(temp) && charMap.get(temp) != 0) {
                    counter += Math.min(charMap.get(c), charMap.get(temp));
                    tempSteps = Math.max(charMap.get(c), charMap.get(temp)) - Math.min(charMap.get(c), charMap.get(temp));
                    if (tempSteps >= 2) {
                        counter += Math.min(tempSteps / 2, steps);
                        steps = Math.max(0, steps - (tempSteps / 2));
                    }
                    charMap.put(c, 0);
                    charMap.put(temp, 0);
                }
            }

            if (steps > 0) {
                for (char c : charMap.keySet()) {
                    if (charMap.get(c) >= 2) {
                        counter += Math.min(charMap.get(c) / 2, steps);
                        steps = Math.max(0, steps - (charMap.get(c) / 2));
                    }
                    if (steps == 0) break;
                }
            }

            System.out.println(counter);
        }
    }
}
