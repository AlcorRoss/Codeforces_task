import java.util.Scanner;

public class Task0112_CF1807A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            if (a + b == c) System.out.println("+");
            else System.out.println("-");
        }
    }
}
