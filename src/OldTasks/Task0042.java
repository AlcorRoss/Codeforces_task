package OldTasks;

import java.util.*;

public class Task0042 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Integer, Integer> boysMap = new HashMap<>();
        List<Integer> girlsList = new ArrayList<>();
        int result = 0;
        int numberOfValues = in.nextInt();

        for (int i = 0; i < numberOfValues; i++) {
            boysMap.merge(in.nextInt(), 1, Integer::sum);
        }

        numberOfValues = in.nextInt();

        for (int i = 0; i < numberOfValues; i++) {
            girlsList.add(in.nextInt());
        }

        Collections.sort(girlsList);

        for (int temp : girlsList) {
            if (boysMap.containsKey(temp - 1) && boysMap.get(temp - 1) != 0) {
                boysMap.put(temp - 1, boysMap.get(temp - 1) - 1);
                result++;
            } else if (boysMap.containsKey(temp) && boysMap.get(temp) != 0) {
                boysMap.put(temp, boysMap.get(temp) - 1);
                result++;
            } else if (boysMap.containsKey(temp + 1) && boysMap.get(temp + 1) != 0) {
                boysMap.put(temp + 1, boysMap.get(temp + 1) - 1);
                result++;
            }
        }

        System.out.println(result);
    }
}
