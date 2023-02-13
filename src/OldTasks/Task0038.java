package OldTasks;

import java.util.Scanner;

public class Task0038 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int stick, diamond, temp;
        int quantityOfTests = in.nextInt();
        int[] results = new int[quantityOfTests];

        for (int i = 0; i < quantityOfTests; i++) {

            stick = in.nextInt();
            diamond = in.nextInt();
            temp = Math.min((stick + diamond) / 3, stick);
            results[i] = Math.min(temp, diamond);

        }

        for (int result : results) {
            System.out.println(result);
        }

    }
}

