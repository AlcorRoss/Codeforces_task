import java.util.*;

public class Task0084_CF1454C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            int numberOfValues = in.nextInt();
            int[] values = new int[numberOfValues];
            List<Integer> valuesList = new ArrayList<>();
            Map<Integer, Integer> resultQuantity = new LinkedHashMap<>();

            for (int i = 0; i < numberOfValues; i++) values[i] = in.nextInt();

            valuesList.add(values[0]);
            for (int i = 1; i < values.length; i++)
                if (values[i] != values[i - 1]) valuesList.add(values[i]);

            for (int value : valuesList) resultQuantity.merge(value, 1, Integer::sum);

            int[] result = new int[resultQuantity.size()];
            int temp = 0;
            for (int value : resultQuantity.values()) {
                result[temp] = value;
                temp++;
            }

            result[0] -= 1;
            result[result.length - 1] -= 1;

            for (int i = 1; i < result.length - 1; i++) result[i] += 1;

            temp = 0;
            for (int value : result) temp = Math.min(temp, value);

            System.out.println(temp);
        }
    }
}






















