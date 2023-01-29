import java.util.Scanner;

public class Task0043 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        boolean flag;
        int x, y, counter;
        double result = 0;

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            flag = true;
            x = y = 1;
            counter = 0;

            while (result != n) {
                result = (Math.pow(x, y) * y) + (Math.pow(y, x) * x);



                if (x >= n || y >= n) {
                    System.out.println(-1);
                    flag = false;
                    break;
                }

                if (counter < 19) {
                    x++;
                    if ((Math.pow(x, y) * y) + (Math.pow(y, x) * x) == n) break;
                } else {
                    y++;
                    x = y;
                    counter = 0;
                    if ((Math.pow(x, y) * y) + (Math.pow(y, x) * x) == n) break;
                }

                counter++;
            }

            if (flag) {
                System.out.println(x + " " + y);
            }
        }
    }
}
