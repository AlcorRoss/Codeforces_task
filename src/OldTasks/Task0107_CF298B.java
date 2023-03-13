package OldTasks;

import java.util.Scanner;

public class Task0107_CF298B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        int x_1 = in.nextInt();
        int y_1 = in.nextInt();
        int x_2 = in.nextInt();
        int y_2 = in.nextInt();
        int counter = 0;
        char[] directions = in.next().toCharArray();

        for (char direction : directions) {
            switch (direction) {
                case ('S') -> {
                    if (y_1 > y_2) y_1 -= 1;
                    counter++;
                }
                case ('N') -> {
                    if (y_1 < y_2) y_1 += 1;
                    counter++;
                }
                case ('E') -> {
                    if (x_1 < x_2) x_1 += 1;
                    counter++;
                }
                case ('W') -> {
                    if (x_1 > x_2) x_1 -= 1;
                    counter++;
                }
            }
            if (x_1 == x_2 && y_1 == y_2) {
                System.out.println(counter);
                return;
            }
        }
        System.out.println(-1);
    }
}
