import java.util.Scanner;
import java.util.TreeMap;

public class Task0075_CF1355B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            int numberOfValues = in.nextInt();
            int counter = 0, buffer = 0;
            TreeMap<Integer, Integer> valuesMap = new TreeMap<>();

            for (int i = 0; i < numberOfValues; i++) {
                valuesMap.merge(in.nextInt(), 1, Integer::sum);
            }

            for (var pair : valuesMap.entrySet()) {
                counter += (pair.getValue() + buffer) / pair.getKey();
                buffer = (pair.getValue() + buffer) % pair.getKey();
            }
            System.out.println(counter);
        }
    }
}
