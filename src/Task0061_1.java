import java.util.Scanner;

public class Task0061_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTest = in.nextInt();

        for (int i = 0; i < numberOfTest; i++) {
            int numberOfTwo = 0, counter = 0;
            int numberOfValues = in.nextInt();
            int[] values = new int[numberOfValues];

            for (int j = 0; j < numberOfValues; j++) {
                values[j] = in.nextInt();
                if (values[j] == 2) numberOfTwo++;
            }

            if (numberOfTwo % 2 != 0) {
                System.out.println(-1);
                continue;
            }

            for (int j = 0; j < values.length; j++) {
                if (values[j] == 2) counter++;
                if (counter == numberOfTwo / 2) {
                    System.out.println(j + 1);
                    break;
                }
            }
        }
    }
}













