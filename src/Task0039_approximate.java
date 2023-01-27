import java.util.Scanner;

public class Task0039_approximate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int quantityOfValues, maxValue, maxIndex, result, temp, indexTemp;
        boolean flag;
        int numberOfTests = in.nextInt();
        int[] results = new int[numberOfTests];

        for (int i = 0; i < numberOfTests; i++) {
            flag = true;
            maxValue = maxIndex = temp = indexTemp = result = 0;
            quantityOfValues = in.nextInt();
            int[] values = new int[quantityOfValues];

            for (int j = 0; j < values.length; j++) {
                values[j] = in.nextInt();

                if (values[j] > maxValue) {
                    maxValue = result = values[j];
                    maxIndex = indexTemp = j;
                    temp = maxIndex - 1;
                }
            }

            while (temp > 0) {
                if (values[temp] + temp == indexTemp) {
                    result += values[temp];
                    indexTemp = temp;
                }
                temp--;
            }

            indexTemp = maxIndex;
            temp = maxValue;

            while (true) {
                if (temp + indexTemp < values.length) {

                    if (flag) {
                        result -= maxValue;
                        flag = false;
                    }

                    result += values[indexTemp];
                    temp = values[indexTemp];
                    indexTemp += temp;
                } else {
                    if (flag) result -= values[indexTemp];
                    result += values[indexTemp];
                    break;
                }
            }
            results[i] = result;
        }

        for (int i : results) {
            System.out.println(i);
        }
    }
}















