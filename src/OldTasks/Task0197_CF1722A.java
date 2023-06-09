package OldTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task0197_CF1722A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        char[] temp = "Timur".toCharArray();
        Arrays.sort(temp);
        String purpose = String.valueOf(temp);
        int numberOfTest = in.nextInt();

        while (numberOfTest-- > 0) {
            if (in.nextInt() != 5) {
                System.out.println("NO");
                in.next();
                continue;
            }
            char[] chars = in.next().toCharArray();
            Arrays.sort(chars);
            if (purpose.equals(String.valueOf(chars))) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
