import java.util.*;

public class Task0083_CF1406B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOFTests = in.nextInt();
        while (numberOFTests-- > 0) {
            int numberOfValues = in.nextInt();
            int temp = 0;
            List<Integer> values = new ArrayList<>();
            List<Integer> tempList1 = null;
            List<Integer> tempList2 = null;
            ArrayList<Integer> resultList = new ArrayList<>();
            boolean flag = false, flag2 = false, flag3 = false;
            long result;

            for (int i = 0; i < numberOfValues; i++) values.add(in.nextInt());

            if (values.size() == 5) {
                System.out.println(values.stream().reduce((acc, i) -> acc * i).get().longValue());
                continue;
            }

            values.sort(Comparator.comparingInt(Math::abs));
            for (int i = values.size() - 1; i > values.size() - 6; i--) {
                resultList.add(values.get(i));
                if (values.get(i) < 0) temp++;
                if (values.get(i) == 0) flag = true;
            }

            if (flag) {
                System.out.println(resultList.stream().reduce((acc, i) -> acc * i).get().longValue());
                continue;
            }

            for (int i = 0; i < 5; i++) values.remove(values.size() - 1);

            if (temp % 2 != 0) {
                for (int value : values) {
                    if (value < 0) flag2 = true;
                    if (value > 0) flag3 = true;
                    if (flag2 && flag3) break;
                }

                tempList1 = (ArrayList) resultList.clone();
                tempList2 = (ArrayList) resultList.clone();

                for (int i = 4; i >= 0; i--) {
                    if (tempList1.get(i) > 0 && flag2) {
                        tempList1.set(i, Collections.min(values));
                        break;
                    }
                }

                for (int i = 4; i >= 0; i--) {
                    if (tempList2.get(i) < 0 && flag3) {
                        tempList2.set(i, Collections.max(values));
                        break;
                    }
                }

            }
            result = tempList1.stream().reduce((acc, i) -> acc * i).get().longValue();
            result = Math.max(result, tempList2.stream().reduce((acc, i) -> acc * i).get().longValue());
            result = Math.max(result, resultList.stream().reduce((acc, i) -> acc * i).get().longValue());
            System.out.println(result);
        }
    }
}

