import java.util.Scanner;

public class Task0044_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests, temp;
        int numberOfBox = in.nextInt();
        int[] boxes = new int[numberOfBox + 1];

        for (int i = 1; i < boxes.length; i++) {
            boxes[i] = in.nextInt();
        }

        numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            temp = in.nextInt();
            for (int j = 1; j < boxes.length; j++) {
                temp -= boxes[j];
                if (temp <= 0) {
                    System.out.println(j);
                    break;
                }
            }
        }
    }
}
