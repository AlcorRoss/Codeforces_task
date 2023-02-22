import java.util.*;

public class Task0083_CF1406B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOFTests = in.nextInt();
        while (numberOFTests-- > 0) {
            int numberOfValues = in.nextInt();
            int temp = 0;
            List<Integer> values = new ArrayList<>();
            List<Integer> resultList = new ArrayList<>();
            boolean flag = true, flag2 = false, flag3 = false;

            for (int i = 0; i < numberOfValues; i++) values.add(in.nextInt());

            if (values.size() == 5) {
                long result = values.stream().reduce((acc, i) -> acc * i).get().longValue();
                System.out.println(result);
                continue;
            }

            values.sort(Comparator.comparingInt(Math::abs));
            for (int i = values.size() - 1; i > values.size() - 6; i--) {
                resultList.add(values.get(i));
                if (values.get(i) < 0) temp++;
                if (values.get(i) == 0) flag = false;
            }

            for (int i = 0; i < 5; i++) values.remove(values.size() - 1);

            if (temp % 2 != 0 && flag) {
                for (int value : values) {
                    if (value < 0) flag2 = true;
                    if (value > 0) flag3 = true;
                    if (flag2 && flag3) break;
                }

                for (int i = 4; i >= 0; i--) {
                    if (resultList.get(i) > 0 && flag2) {
                        resultList.set(i, Collections.min(values));
                        break;
                    }
                    if (resultList.get(i) < 0 && flag3) {
                        resultList.set(i, Collections.min(values));
                        break;
                    }
                }

                System.out.println(resultList.stream().reduce((acc, i) -> acc * i).get().longValue());
            }
        }
    }
}
