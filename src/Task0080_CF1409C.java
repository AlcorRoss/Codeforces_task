import java.util.Scanner;

public class Task0080_CF1409C {
    public static void main(String[] s) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            int n = in.nextInt() - 1, x = in.nextInt(), y = in.nextInt();
            int temp = n, diff = y - x;

            while (diff % temp != 0) temp--;
            temp = diff / temp;

            int j = n - diff / temp;
            for (int i = 0; i < j; i++) {
                if (x - temp > 0) x -= temp;
                else break;
            }
            for (int i = -1; i < n; i++) {
                System.out.print(x + " ");
                x += temp;
            }
            System.out.println();
        }
    }
}
