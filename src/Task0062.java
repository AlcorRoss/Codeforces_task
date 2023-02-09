import java.util.Scanner;

public class Task0062 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTest = in.nextInt();

        for (int i = 0; i < numberOfTest; i++) {
            int purpose = in.nextInt();

            if (purpose % 2 == 0) {
                System.out.println(purpose / 2 + " " + purpose / 2);
            } else {
                System.out.println(purpose / 2 + " " + (purpose / 2 + 1));
            }
        }
    }
}
