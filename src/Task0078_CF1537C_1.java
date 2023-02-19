import java.util.*;

public class Task0078_CF1537C_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            int minDiff = Integer.MAX_VALUE, temp;
            int minDiffIndex = 0;
            int numberOfValues = in.nextInt();
            int[] values = new int[numberOfValues];

            for (int i = 0; i < numberOfValues; i++) {
                values[i] = in.nextInt();
            }
            Arrays.sort(values);

            if (values.length == 2) {
                System.out.println(values[0] + " " + values[1]);
            } else {
                for (int i = 1; i < values.length; i++) {
                    temp = values[i] - values[i - 1];
                    if (temp < minDiff) {
                        minDiff = temp;
                        minDiffIndex = i;
                    }
                }

                for (int i = minDiffIndex; i < values.length; i++) {
                    System.out.print(values[i] + " ");
                }

                for (int i = 0; i < minDiffIndex; i++) {
                    if (i != minDiffIndex - 1) System.out.print(values[i] + " ");
                    else System.out.println(values[i]);
                }
            }
        }
    }
}
