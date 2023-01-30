import java.util.Scanner;

public class Task0044 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests, temp;
        int numberOfBox = in.nextInt();
        int[] boxes = new int[numberOfBox];

        for (int i = 0; i < numberOfBox; i++) {
            if (i == 0) {
                boxes[i] = in.nextInt();
            } else {
                boxes[i] = in.nextInt() + boxes[i - 1];
            }
        }

        numberOfTests = in.nextInt();
        for (int i = 0; i < numberOfTests; i++) {
            temp = in.nextInt();
            for (int j = 0; j < numberOfBox; j++) {
                if (boxes[j] >= temp) {
                    System.out.println(j);
                    break;
                }
            }
        }
    }
}
