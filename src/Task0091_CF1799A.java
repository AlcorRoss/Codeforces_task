import java.util.Arrays;
import java.util.Scanner;

public class Task0091_CF1799A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            int fieldSize = in.nextInt();
            int numberOfSteps = in.nextInt();
            int[] field = new int[fieldSize];
            int[] steps = new int[numberOfSteps];
            int temp = field.length - 1, preVal = -1;

            Arrays.fill(field, -1);
            for (int i = 0; i < numberOfSteps; i++) steps[i] = in.nextInt();

            if (steps.length == 0) {
                fieldPrint(field);
            } else if (steps.length == 1) {
                field[field.length - 1] = 1;
                fieldPrint(field);
            } else {
                for (int i = 0; i < steps.length; i++) {
                    if (steps[i] != preVal) {
                        field[temp] = i + 1;
                        temp--;
                        if (temp < 0) break;
                    }
                    preVal = steps[i];
                }
                fieldPrint(field);
            }
        }

    }

    public static void fieldPrint(int[] field) {
        for (int i = 0; i < field.length; i++) {
            if (i == field.length - 1) System.out.println(field[i]);
            else System.out.print(field[i] + " ");
        }
    }
}
