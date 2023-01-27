import java.util.Scanner;

public class Task0039_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int quantityOfValues, result;
        int quantityOfTests = in.nextInt();
        int[] results = new int[quantityOfTests];

        for (int i = 0; i < quantityOfTests; i++) {
            quantityOfValues = in.nextInt();
            int[] values = new int[quantityOfValues];
            int[] temp = new int[quantityOfValues];
            result = 0;

            for (int j = 0; j < quantityOfValues; j++) {
                values[j] = in.nextInt();
            }

            for (int j = quantityOfValues - 1; j >= 0; j--) {
                temp[j] = values[j];
                if (values[j] + j < quantityOfValues) {
                    temp[j] += temp[j + values[j]];
                }
                result = Math.max(temp[j], result);
            }
            results[i] = result;
        }

        for (int i : results) {
            System.out.println(i);
        }
    }
}

