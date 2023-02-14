import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task0069_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            int numberOfValues = in.nextInt();
            int averageValue = 0, averageValue2, temp, maxQuantity = 0, preMaxQuantity = 0, result;
            double averageValue1;
            Map<Integer, Integer> valueMap = new HashMap<>();
            Map<Integer, Integer> valueMap1 = new HashMap<>();
            Map<Integer, Integer> valueMap2 = new HashMap<>();

            for (int j = 0; j < numberOfValues; j++) {
                temp = in.nextInt();
                valueMap.merge(temp, 1, Integer::sum);
                valueMap1.merge(temp, 1, Integer::sum);
                valueMap2.merge(temp, 1, Integer::sum);
                averageValue += temp;
            }

            if (numberOfValues == 1) {
                System.out.println(0);
                continue;
            } else if (numberOfValues < 4) {
                System.out.println(1);
                continue;
            }

            averageValue1 = (double) averageValue / numberOfValues;
            averageValue1 *= 2;

            averageValue /= numberOfValues;
            averageValue *= 2;

            temp = 0;
            for (var pair : valueMap.entrySet()) {
                if (pair.getValue() > temp) {
                    temp = pair.getValue();
                    maxQuantity = pair.getKey();
                }
            }

            temp = 0;
            for (var pair : valueMap.entrySet()) {
                if (pair.getValue() > temp && pair.getKey() != maxQuantity) {
                    temp = pair.getValue();
                    preMaxQuantity = pair.getKey();
                }
            }

            averageValue2 = maxQuantity + preMaxQuantity;

            result = valueMap.get(maxQuantity) / 2;
            result = Math.max(result, calculate(valueMap, averageValue));
            result = Math.max(result, calculate(valueMap1, (int) averageValue1));
            result = Math.max(result, calculate(valueMap2, averageValue2));

            System.out.println(result);
        }
    }

    public static int calculate(Map<Integer, Integer> valueMap, int averageValue) {
        int temp = 0;
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
        return temp;
    }
}
