package OldTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task0194_CF1626A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            var charArray = in.next().toCharArray();
            Arrays.sort(charArray);
            System.out.println(String.valueOf(charArray));
        }
    }
}
