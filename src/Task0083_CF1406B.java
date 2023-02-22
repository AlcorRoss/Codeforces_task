import java.util.*;

public class Task0083_CF1406B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOFTests = in.nextInt();
        while (numberOFTests-- > 0) {
            int numberOfValues = in.nextInt();
            int temp = 0;
            List<Integer> values = new ArrayList<>();
            List<Integer> tempList = new ArrayList<>();
            boolean flag = false;

            for (int i = 0; i < numberOfValues; i++) {
                values.add(in.nextInt());
                if (values.get(i) >= 0) flag = true;
            }

            if (values.size() == 5) {
                long result = values.stream().reduce((acc, i) -> acc * i).get().longValue();
                System.out.println(result);
                continue;
            }

            values.sort(Comparator.comparingInt(Math::abs));
            for (int i = values.size() - 1; i > values.size() - 6; i--) {
                tempList.add(values.get(i));
                if (values.get(i) < 0) temp++;
            }

            if (temp % 2 != 0 && flag) {
                for (int i = tempList.size() - 1; i >= 0; i--) {
                    if (values.get(i) < 0) {
                        temp = i;
                        break;
                    }
                }

                for (int i = values.size() - 6; i >= 0; i--) {
                    if (values.get(i) >= 0) {
                        tempList.set(temp, values.get(i));
                        break;
                    }
                }
            }

            System.out.println(tempList.stream().reduce((acc, i) -> acc * i).get().longValue());
        }
    }
}
