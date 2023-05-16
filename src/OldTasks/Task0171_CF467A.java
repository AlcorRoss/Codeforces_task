package OldTasks;

import java.util.Scanner;

public class Task0171_CF467A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTest = in.nextInt();
        int counter = 0;
        while (numberOfTest-- > 0) if (in.nextInt() + 2 <= in.nextInt()) counter++;
        System.out.println(counter);
    }
}
