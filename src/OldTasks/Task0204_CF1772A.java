package OldTasks;

import java.util.Scanner;

public class Task0204_CF1772A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int numberOfTest = in.nextInt();

        while (numberOfTest-- > 0) {
            String[] values = in.next().split("\\+");
            System.out.println(Integer.parseInt(values[0]) + Integer.parseInt(values[1]));
        }
    }
}
