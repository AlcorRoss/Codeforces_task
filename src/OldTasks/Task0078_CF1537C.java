package OldTasks;

import java.util.*;

public class Task0078_CF1537C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            long minDiff = Integer.MAX_VALUE, temp;
            int minDiffIndex = 0;
            int numberOfValues = in.nextInt();
            List<Long> values = new LinkedList<>();

            for (int i = 0; i < numberOfValues; i++) {
                values.add(in.nextLong());
            }
            Collections.sort(values);

            for (int i = 1; i < values.size(); i++) {
                temp = values.get(i) - values.get(i - 1);
                if (temp < minDiff) {
                    minDiff = temp;
                    minDiffIndex = i;
                }
            }

            temp = values.get(minDiffIndex - 1);
            values.remove(minDiffIndex - 1);
            values.add(0, temp);

            temp = values.get(minDiffIndex);
            values.remove(minDiffIndex);
            values.add(temp);

            for (int i = 0; i < values.size() - 2; i++) {
                if (values.get(i) > values.get(i + 1)) {
                    for (int j = i + 1; j < values.size() - 1; j++) {
                        if (values.get(i) < values.get(j)) {
                            temp = values.get(i + 1);
                            values.set(i + 1, values.get(j));
                            values.set(j, temp);
                        }
                    }
                }
            }

            for (int i = 0; i < values.size(); i++) {
                if (i != values.size() - 1) System.out.print(values.get(i) + " ");
                else System.out.println(values.get(i));
            }
        }
    }
}
