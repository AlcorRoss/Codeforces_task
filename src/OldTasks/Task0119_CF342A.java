package OldTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task0119_CF342A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfValues = in.nextInt();
        int[] quantityOfValues = new int[8];
        int numberOf124, numberOf126, numberOf136, temp = 0;

        while (numberOfValues-- > 0) quantityOfValues[in.nextInt()]++;
        for (int quantityOfValue : quantityOfValues) if (quantityOfValue != 0) temp++;
        if (quantityOfValues[1] == 0 || quantityOfValues[2] == 0 && quantityOfValues[3] == 0
                || quantityOfValues[5] != 0 || quantityOfValues[7] != 0 || temp < 3) {
            System.out.println(-1);
            return;
        }
        numberOf124 = Math.min(quantityOfValues[1], quantityOfValues[2]);
        numberOf124 = Math.min(numberOf124, quantityOfValues[4]);
        quantityOfValues[1] -= numberOf124;
        quantityOfValues[2] -= numberOf124;
        quantityOfValues[4] -= numberOf124;
        numberOf126 = Math.min(quantityOfValues[1], quantityOfValues[2]);
        numberOf126 = Math.min(numberOf126, quantityOfValues[6]);
        quantityOfValues[1] -= numberOf126;
        quantityOfValues[2] -= numberOf126;
        quantityOfValues[6] -= numberOf126;
        numberOf136 = Math.min(quantityOfValues[1], quantityOfValues[3]);
        numberOf136 = Math.min(numberOf136, quantityOfValues[6]);
        quantityOfValues[1] -= numberOf136;
        quantityOfValues[3] -= numberOf136;
        quantityOfValues[6] -= numberOf136;
        temp = Arrays.stream(quantityOfValues).reduce(Integer::sum).getAsInt();
        if (numberOf124 == 0 && numberOf126 == 0 && numberOf136 == 0 || temp != 0) {
            System.out.println(-1);
        } else {
            for (int i = 0; i < numberOf124; i++) System.out.println("1 2 4");
            for (int i = 0; i < numberOf126; i++) System.out.println("1 2 6");
            for (int i = 0; i < numberOf136; i++) System.out.println("1 3 6");
        }
    }
}
