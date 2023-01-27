import java.util.Scanner;

public class Task0039 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int quantityOfValues, maxResult, result, temp;
        int numberOfTests = in.nextInt();
        int[] results = new int[numberOfTests];

        for (int i = 0; i < numberOfTests; i++) {
            result = 0;
            quantityOfValues = in.nextInt();
            int[] values = new int[quantityOfValues];

            for (int j = 0; j < values.length; j++) {
                values[j] = in.nextInt();
            }

            for (int k = 0; k < values.length; k++) {
                maxResult = 0;
                temp = k;

                while (true) {
                    if (values[temp] + temp < values.length) {
                        maxResult += values[temp];
                        temp += values[temp];
                    } else {
                        maxResult += values[temp];
                        break;
                    }
                }
                if (result < maxResult) result = maxResult;
            }
            results[i] = result;
        }

        for (int i : results) {
            System.out.println(i);
        }
    }
}

