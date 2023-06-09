import java.util.Scanner;

public class Task0196_CF1311A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int numberOfValue = in.nextInt();

        while (numberOfValue-- > 0) {
            int value = in.nextInt();
            int purpose = in.nextInt();
            if (value == purpose) {
                System.out.println(0);
            } else if (value > purpose) {
                if ((value - purpose) % 2 == 0) System.out.println(1);
                else System.out.println(2);
            } else {
                if ((purpose - value) % 2 != 0) System.out.println(1);
                else System.out.println(2);
            }
        }
    }
}
