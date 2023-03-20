import java.util.Scanner;

public class Task0114_CF1807B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            int numberOfValues = in.nextInt();
            int temp, odd = 0, even = 0;

            while (numberOfValues-- > 0) {
                temp = in.nextInt();
                if (temp % 2 == 0) even += temp;
                else odd += temp;
            }
            if (even > odd) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
