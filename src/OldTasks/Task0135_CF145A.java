package OldTasks;

import java.util.Scanner;

public class Task0135_CF145A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String lineA = in.next();
        String lineB = in.next();
        int counterFour = 0, counterSeven = 0, temp;

        for (int i = 0; i < lineA.length(); i++) {
            if (lineA.charAt(i) != lineB.charAt(i)) {
                temp = Integer.parseInt(String.valueOf(lineA.charAt(i)));
                if (temp == 4) counterFour++;
                else counterSeven++;
            }
        }
        System.out.println(Math.max(counterFour, counterSeven));
    }
}
