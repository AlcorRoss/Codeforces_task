package OldTasks;

import java.util.Scanner;

public class Task0164_CF281A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.next();
        line = line.substring(0, 1).toUpperCase() + line.substring(1);
        System.out.println(line);
    }
}
