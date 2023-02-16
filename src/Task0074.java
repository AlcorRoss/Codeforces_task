import java.util.Scanner;

public class Task0074 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            int numberOfValues = in.nextInt();
            int[] values = new int[numberOfValues];
            int maxIndex, temp = 0, counter = 0;

            for (int j = 0; j < values.length; j++) {
                values[j] = in.nextInt();
                if (values[j] > temp) {
                    temp = values[j];
                    maxIndex = j;
                }
            }

            while (true) {

            }


        }
    }
}
