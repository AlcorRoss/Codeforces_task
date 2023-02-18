package OldTasks;

import java.util.Scanner;

public class Task0072 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            in.nextInt();
            in.nextInt();
            String line1 = in.next();
            String line2 = in.next();
            char[] town1 = line1.toCharArray();
            char[] town2 = line2.toCharArray();

            int temp1 = checkTown(town1);
            int temp2 = checkTown(town2);

            if (temp1 == 0 && temp2 == 0) {
                System.out.println("YES");
            } else if (temp1 > 1 || temp2 > 1 || temp1 > 0 && temp2 > 0) {
                System.out.println("NO");
            } else {
                if (town1[town1.length - 1] == town2[town2.length - 1]) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }
    }

    public static int checkTown(char[] town) {
        int counter = 0;
        char temp = '1';
        for (char c : town) {
            if (c == temp) counter++;
            temp = c;
        }
        return counter;
    }
}
