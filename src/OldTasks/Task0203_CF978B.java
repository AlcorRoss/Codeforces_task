package OldTasks;

import java.util.Scanner;

public class Task0203_CF978B {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        in.next();
        int counter = 1, result = 0;
        char[] chars = in.next().toCharArray();
        boolean flag = false;

        for (char aChar : chars) {
            if (aChar == 'x' && !flag) {
                flag = true;
            } else if (flag && aChar != 'x') {
                counter = 1;
                flag = false;
            } else if (flag) {
                counter++;
                if (counter > 2) result++;
            }
        }
        System.out.println(result);
    }
}
