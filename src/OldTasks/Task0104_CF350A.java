package OldTasks;

import java.util.Scanner;

public class Task0104_CF350A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTrue = in.nextInt();
        int numberOfFalse = in.nextInt();
        int minTrue = Integer.MAX_VALUE, maxTrue = Integer.MIN_VALUE, minFalse = Integer.MAX_VALUE, temp;

        while (numberOfTrue-- > 0) {
            temp = in.nextInt();
            minTrue = Math.min(minTrue, temp);
            maxTrue = Math.max(maxTrue, temp);
        }
        while (numberOfFalse-- > 0) minFalse = Math.min(minFalse, in.nextInt());
        if (minFalse <= maxTrue || minFalse <= minTrue * 2) System.out.println(-1);
        else System.out.println(Math.max(maxTrue, minTrue * 2));
    }
}
