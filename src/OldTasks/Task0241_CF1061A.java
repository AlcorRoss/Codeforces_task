package OldTasks;

import java.util.Scanner;

public class Task0241_CF1061A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int maxCost = in.nextInt();
        int purpose = in.nextInt();
        int result = 0;

        while (purpose % maxCost != 0) {
            result += purpose / maxCost;
            purpose = purpose % maxCost;
            maxCost--;
        }
        result += purpose / maxCost;
        System.out.println(result);
    }
}
