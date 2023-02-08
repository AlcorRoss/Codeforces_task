import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task0059 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            long result = 0;
            int temp;
            int numberOfValues = in.nextInt();
            Map<Integer, Integer> pairs = new HashMap<>();

            for (int j = 0; j < numberOfValues; j++) {
                temp = in.nextInt();
                pairs.merge(temp - j, 1, Integer::sum);
            }

            for (long value : pairs.values()) {
                if (value > 1) {
                    result += (value * (value - 1)) / 2;
                }
            }

            System.out.println(result);
        }
    }
}
