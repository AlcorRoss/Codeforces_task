package OldTasks;

import java.util.Scanner;

public class Task0133_CF463A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfValues = in.nextInt();
        int money = in.nextInt();
        int result = 100, temp, temp1;
        boolean flag = true;

        while (numberOfValues-- > 0) {
            temp = in.nextInt();
            temp1 = in.nextInt();
            if (money - 1 >= temp || money == temp && temp1 == 0) {
                flag = false;
                if (temp1 != 0) result = Math.min(result, temp1);
            }
        }
        if (flag) System.out.println(-1);
        else System.out.println(100 - result);
    }
}
