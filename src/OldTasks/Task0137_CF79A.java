package OldTasks;

import java.util.Scanner;

public class Task0137_CF79A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sumOf100 = in.nextInt() * 100;
        int sumOf10 = in.nextInt() * 10;
        int counter = 0, temp;

        while (true) {
            temp = 220;
            if (counter % 2 == 0) {
                if (sumOf100 >= 200) {
                    temp = 20;
                    sumOf100 -= 200;
                } else if (sumOf100 > 0) {
                    temp = 120;
                    sumOf100 -= 100;
                }
                if (sumOf10 >= temp) {
                    sumOf10 -= temp;
                } else {
                    System.out.println("Hanako");
                    break;
                }
            } else {
                if (sumOf10 >= 220) {
                    temp = 0;
                    sumOf10 -= 220;
                } else if (sumOf10 >= 120) {
                    temp = 100;
                    sumOf10 -= 120;
                } else if (sumOf10 >= 20) {
                    temp = 200;
                    sumOf10 -= 20;
                }
                if (temp % 100 == 0 && sumOf100 - temp >= 0) {
                    sumOf100 -= temp;
                } else {
                    System.out.println("Ciel");
                    break;
                }
            }
            counter++;
        }
    }
}
