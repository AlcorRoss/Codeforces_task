package OldTasks;

import java.util.Scanner;

public class Task0110_CF552B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long numberOfBooks = in.nextLong();
        long result, numberOfDigits;

        numberOfDigits = String.valueOf(numberOfBooks).length();
        result = numberOfDigits * (numberOfBooks + 1);
        for (int i = 0; i < numberOfDigits; i++) result -= Math.pow(10, i);
        System.out.println(result);
    }
}

