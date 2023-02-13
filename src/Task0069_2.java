import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task0069_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            int numberOfValues = in.nextInt();
            int averageValue = 0, temp, result = 0;
            double averageWeight, averageRound;
            Map<Integer, Integer> valueMap = new HashMap<>();
            Map<Integer, Integer> weightMap = new HashMap<>();
            Map<Integer, Integer> weightMap1 = new HashMap<>();

            for (int j = 0; j < numberOfValues; j++) {
                temp = in.nextInt();
                valueMap.merge(temp, 1, Integer::sum);
                weightMap.merge(temp, 1, Integer::sum);
                weightMap1.merge(temp, 1, Integer::sum);
                averageValue += temp;
            }

            if (numberOfValues == 1) {
                System.out.println(0);
                continue;
            } else if (numberOfValues < 4) {
                System.out.println(1);
                continue;
            }

            averageRound = Math.round((double) averageValue / (double) numberOfValues);
            averageRound *= 2;

            averageWeight = (double) averageValue / numberOfValues;
            averageWeight *= 2;

            averageValue /= numberOfValues;
            averageValue *= 2;
            temp = 0;
            System.out.println(averageValue);

            for (int value : valueMap.keySet()) {
                if (averageValue - value > 0 && valueMap.containsKey(averageValue - value)
                        && valueMap.get(averageValue - value) != 0) {
                    if ((averageValue - value) == value) {
                        temp += valueMap.get(value) / 2;
                    } else {
                        temp += Math.min(valueMap.get(value), valueMap.get(averageValue - value));
                    }
                    valueMap.put(averageValue - value, 0);
                }
                valueMap.put(value, 0);
            }

            averageValue = (int) averageWeight;
            System.out.println(averageValue);

            for (int value : weightMap.keySet()) {
                if (averageValue - value > 0 && weightMap.containsKey(averageValue - value)
                        && weightMap.get(averageValue - value) != 0) {
                    if ((averageValue - value) == value) {
                        result += weightMap.get(value) / 2;
                    } else {
                        result += Math.min(weightMap.get(value), weightMap.get(averageValue - value));
                    }
                    weightMap.put(averageValue - value, 0);
                }
                weightMap.put(value, 0);
            }

            result = Math.max(result, temp);

            averageValue = (int) averageRound;
            temp = 0;

            System.out.println(averageValue);

            for (int value : weightMap1.keySet()) {
                if (averageValue - value > 0 && weightMap1.containsKey(averageValue - value)
                        && weightMap1.get(averageValue - value) != 0) {
                    if ((averageValue - value) == value) {
                        temp += weightMap1.get(value) / 2;
                    } else {
                        temp += Math.min(weightMap1.get(value), weightMap1.get(averageValue - value));
                    }
                    weightMap1.put(averageValue - value, 0);
                }
                weightMap1.put(value, 0);
            }

            result = Math.max(result, temp);
            
            System.out.println(result);
        }
    }
}
