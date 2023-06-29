package OldTasks;

import java.util.Scanner;

public class Task0216_CF1368A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int numberOfTest = in.nextInt();

        while (numberOfTest-- > 0) {
            int valueA = in.nextInt();
            int valueB = in.nextInt();
            int purpose = in.nextInt();
            int counter = 0;

            while (Math.max(valueA, valueB) <= purpose) {
                counter++;
                if (valueA >= valueB) valueB += valueA;
                else valueA += valueB;
            }
            System.out.println(counter);
        }
    }
}
