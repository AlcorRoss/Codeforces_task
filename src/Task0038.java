import java.util.Scanner;

public class Task0038 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int stick, diamond;
        int quantityOfTests = in.nextInt();
        int[] results = new int[quantityOfTests];

        for (int i = 0; i < quantityOfTests; i++) {
            stick = in.nextInt();
            diamond = in.nextInt();

            if (stick == 0 || diamond == 0) {
                results[i] = 0;
                continue;
            }

            results[i] = (stick + diamond) / 3;
        }

        for (int result : results) {
            System.out.println(result);
        }

    }
}

