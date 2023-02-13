package OldTasks;

import java.util.Scanner;

public class Task0044_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests, temp;
        int numberOfBox = in.nextInt();
        int[] boxes = new int[numberOfBox + 1];

        for (int i = 1; i < boxes.length; i++) {
            if (i == 1) {
                boxes[i] = in.nextInt();
            } else {
                boxes[i] = in.nextInt() + boxes[i - 1];
            }
        }

        int[] wormNumber = new int[boxes[boxes.length - 1] + 1];
        temp = 1;

        for (int i = 1; i < wormNumber.length; i++) {
            if (i > boxes[temp]) temp++;
            wormNumber[i] = temp;
        }

        numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            System.out.println(wormNumber[in.nextInt()]);
        }
    }
}
