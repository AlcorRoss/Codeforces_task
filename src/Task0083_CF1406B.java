import java.util.Arrays;
import java.util.Scanner;

public class Task0083_CF1406B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            int n = in.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++)
                a[i] = in.nextLong();
            Arrays.sort(a);
            System.out.println(Math.max(Math.max(a[0] * a[1] * a[2] * a[3] * a[n - 1], a[0] * a[1] * a[n - 1] * a[n - 2] * a[n - 3]), a[n - 1] * a[n - 2] * a[n - 3] * a[n - 4] * a[n - 5]));
        }
    }
}
