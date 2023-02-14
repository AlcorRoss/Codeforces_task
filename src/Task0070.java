import java.util.Arrays;
import java.util.Scanner;

public class Task0070 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfValues = in.nextInt();
        int purpose = in.nextInt();
        long[] values = new long[numberOfValues];

        for (int i = 0; i < numberOfValues; i++) {
            values[i] = in.nextLong();
        }

        Arrays.sort(values);
        if (values.length == 1) {
            if (purpose == 0 && values[0] > 1)
                System.out.println(values[0] - 1);
            else if (purpose == 0 && values[0] == 1)
                System.out.println(-1);
            else
                System.out.println(values[0]);
        } else if (purpose == 0 && values[0] > 1) {
            System.out.println(values[0] - 1);
        } else if (purpose == 0 && values[0] == 1) {
            System.out.println(-1);
        } else if (values[purpose - 1] != (values[purpose])) {
            System.out.println(values[purpose - 1]);
        } else {
            System.out.println(-1);
        }

    }
}
