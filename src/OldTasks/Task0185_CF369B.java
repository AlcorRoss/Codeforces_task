package OldTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task0185_CF369B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfPart = in.nextInt();
        int numberMax = in.nextInt();
        in.nextInt();
        int max = in.nextInt();
        int sum = in.nextInt();
        int sumMax = in.nextInt();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < numberMax; i++) result.add(sumMax / numberMax);
        if (sumMax % numberMax != 0) {
            int temp = sumMax % numberMax;
            for (int i = 0; i < result.size(); i++) {
                int increase = max - result.get(i);
                increase = Math.min(temp, increase);
                result.set(i, result.get(i) + increase);
                temp -= increase;
                if (temp == 0) break;
            }
        }
        sum -= sumMax;
        numberOfPart -= numberMax;
        if (numberOfPart == 0) {
            result.forEach(a -> System.out.print(a + " "));
            return;
        }
        for (int i = 0; i < numberOfPart; i++) result.add(sum / numberOfPart);
        if (sum % numberOfPart != 0) {
            int temp = sum % numberOfPart;
            int counter = 0;
            for (int i = numberOfPart; i > 0; i--) {
                if (temp % i == 0) {
                    counter = i;
                    temp /= i;
                    break;
                }
            }
            for (int i = result.size() - 1; i >= result.size() - counter; i--) result.set(i, result.get(i) + temp);
        }
        result.forEach(a -> System.out.print(a + " "));
    }
}
