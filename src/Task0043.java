import java.util.Scanner;

public class Task0043 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = 0, y = 0, counter = 0;
        double result = 0;

        while (result != n) {
            result = (Math.pow(x, y) * y) + (Math.pow(y, x) * x);

            if (counter == 0) {
                x++;
                counter = 1;
            } else if (counter == 1) {
                y++;
                counter = 0;
            }

            if (result > n) {
                System.out.println(-1);
                break;
            }
        }

        System.out.println(result);
    }
}
