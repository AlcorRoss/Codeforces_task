import java.util.Scanner;
import java.util.TreeMap;

public class Task0063_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfValues = in.nextInt();
        int[] values = new int[numberOfValues];
        TreeMap<Integer, Integer> sortedValues = new TreeMap<>();

        for (int i = 0; i < values.length; i++) {
            values[i] = in.nextInt();
            sortedValues.merge(values[i], 1, Integer::sum);
        }


        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            int type = in.nextInt();
            int origin = in.nextInt();
            int bound = in.nextInt();
            long result = 0;
            int temp = 0, corrector;
            boolean flag = true;

            switch (type) {
                case (1) -> {
                    for (int j = origin - 1; j <= bound - 1; j++) {
                        result += values[j];
                    }
                }
                case (2) -> {
                    for (var pair : sortedValues.entrySet()) {
                        if (temp < origin) {
                            temp += pair.getValue();
                            if (temp == origin) result += pair.getKey();
                        } else if (temp > origin && flag) {
                            temp += pair.getValue();
                            flag = false;
                            corrector = (temp - origin) * pair.getKey();
                            result += (long) pair.getKey() * pair.getValue() - corrector;
                        } else if (temp < bound) {
                            temp += pair.getValue();
                            flag = false;
                            result += (long) pair.getKey() * pair.getValue();
                            if (temp == bound) break;
                        } else if (temp == bound) {
                            result += pair.getKey();
                            break;
                        } else {
                            corrector = (temp - bound) * pair.getKey();
                            result += (long) pair.getKey() * pair.getValue();
                            result -= corrector;
                            break;
                        }
                    }
                }
            }

            System.out.println(result);
        }
    }
}
