import java.util.Arrays;
import java.util.Scanner;

public class Task0083_CF1406B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            int n = in.nextInt();
            long[] v = new long[n];

            for (int i = 0; i < n; i++)
                v[i] = in.nextLong();
            Arrays.sort(v);
            System.out.println(Math.max(Math.max(v[0] * v[1] * v[2] * v[3] * v[n - 1], v[0] * v[1] * v[n - 1] * v[n - 2] * v[n - 3]), v[n - 1] * v[n - 2] * v[n - 3] * v[n - 4] * v[n - 5]));
        }
    }
}
