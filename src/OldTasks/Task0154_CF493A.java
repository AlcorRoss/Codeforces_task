package OldTasks;

import java.util.*;

public class Task0154_CF493A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String home = in.next();
        String guest = in.next();
        String key = null;
        int numberOfValues = in.nextInt();
        Set<String> finished = new HashSet<>();
        TreeMap<String, String> tempResult = new TreeMap<>();
        TreeMap<String, String> preResult = new TreeMap<>();
        TreeMap<Integer, String> result = new TreeMap<>();

        while (numberOfValues-- > 0) {
            String time = in.next();
            String character = in.next();
            int number = in.nextInt();
            String color = in.next();
            switch (character) {
                case ("h") -> key = home + " " + number;
                case ("a") -> key = guest + " " + number;
            }
            if (finished.contains(key)) continue;
            if (color.equals("r")) {
                preResult.put(key, time);
                finished.add(key);
            } else if (tempResult.containsKey(key)) {
                preResult.put(key, time);
                finished.add(key);
            } else {
                tempResult.put(key, time);
            }
        }
        for (Map.Entry<String, String> entry : preResult.entrySet())
            result.put(Integer.parseInt(entry.getValue()), entry.getKey());
        for (Map.Entry<Integer, String> entry : result.entrySet())
            System.out.println(entry.getValue() + " " + entry.getKey());
    }
}
