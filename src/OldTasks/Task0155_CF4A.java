package OldTasks;

import java.util.Scanner;

public class Task0155_CF4A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int weight = in.nextInt();
        if (weight < 4) System.out.println("NO");
        else System.out.println(weight % 2 == 0 ? "YES" : "NO");
    }
}
