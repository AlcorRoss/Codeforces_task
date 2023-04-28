package OldTasks;

import java.util.Scanner;

public class Task0152_CF155A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfValues = in.nextInt();
        int max = in.nextInt();
        int min = max;
        int counter = 0;
        int temp;

        while (numberOfValues-- > 1) {
            temp = in.nextInt();
            if (temp > max) {
                counter++;
                max = temp;
            } else if (temp < min) {
                counter++;
                min = temp;
            }
        }
        System.out.println(counter);
    }
}
