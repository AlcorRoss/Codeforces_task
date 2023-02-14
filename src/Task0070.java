import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task0070 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfValues = in.nextInt();
        int purpose = in.nextInt();
        Long[] values = new Long[numberOfValues];

        for (int i = 0; i < numberOfValues; i++) {
            values[i] = in.nextLong();
        }

        Arrays.sort(values);
        if (values.length == 1) {
            if (purpose == 0) System.out.println(values[0] - 1);
            else System.out.println(values[0]);
        } else if (purpose == 0) {
            System.out.println(Collections.min(Arrays.asList(values)) - 1);
        } else if (values[purpose - 1].equals(values[purpose])) {
            System.out.println(values[purpose - 1]);
        } else {
            System.out.println(-1);
        }

    }
}
