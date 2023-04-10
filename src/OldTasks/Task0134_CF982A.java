package OldTasks;

import java.util.Scanner;

public class Task0134_CF982A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        String line = in.next();

        line = "0" + line + "0";
        if (line.contains("000") || line.contains("11")) System.out.print("No");
        else System.out.print("Yes");
    }
}
