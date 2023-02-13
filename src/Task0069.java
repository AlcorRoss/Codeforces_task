import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task0069 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            int numberOfValues = in.nextInt();
            int averageValue = 0, temp;
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

            averageValue /= numberOfValues;
            averageValue *= 2;
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
