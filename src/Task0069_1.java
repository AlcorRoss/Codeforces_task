import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task0069_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            int numberOfValues = in.nextInt();
            int averageValue = 0, temp, maxQuantity = 0, preMaxQuantity = 0;
            Map<Integer, Integer> valueMap = new HashMap<>();


            for (int j = 0; j < numberOfValues; j++) {
                temp = in.nextInt();
                valueMap.merge(temp, 1, Integer::sum);
                averageValue += temp;
            }

            if (numberOfValues == 1) {
                System.out.println(0);
                continue;
            } else if (numberOfValues < 4) {
                System.out.println(1);
                continue;
            }

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

            averageValue = maxQuantity + preMaxQuantity;
            temp = 0;

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

            System.out.println(temp);
        }
    }
}
