package OldTasks;

import java.util.Scanner;

public class Task0195_CF1472A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            int width = in.nextInt();
            int height = in.nextInt();
            int purpose = in.nextInt();
            int counter = 1;
            if (purpose == 1) {
                System.out.println("YES");
                continue;
            }
            while (width % 2 == 0 || height % 2 == 0) {
                if (width % 2 == 0) width /= 2;
                else height /= 2;
                counter *= 2;
                if (counter >= purpose) {
                    System.out.println("YES");
                    break;
                }
            }
            if (counter < purpose) System.out.println("NO");
        }
    }
}
