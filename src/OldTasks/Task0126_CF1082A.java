package OldTasks;

import java.util.Scanner;

public class Task0126_CF1082A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            int numberOfPages = in.nextInt();
            int current = in.nextInt();
            int purpose = in.nextInt();
            int step = in.nextInt();
            int result = 0, temp;

            if (Math.abs(purpose - current) % step == 0) {
                result = Math.abs(purpose - current) / step;
                System.out.println(result);
                continue;
            }
            if ((purpose - 1) % step == 0) {
                if (current % step == 0) {
                    temp = current / step;
                } else {
                    temp = (current / step) + 1;
                }
                result = (purpose - 1) / step + temp;
            }
            if ((numberOfPages - purpose) % step == 0) {
                if ((numberOfPages - current) % step == 0) {
                    temp = (numberOfPages - current) / step;
                } else {
                    temp = ((numberOfPages - current) / step) + 1;
                }
                temp += (numberOfPages - purpose) / step;
                if (result != 0) result = Math.min(result, temp);
                else result = temp;
            }
            if (result == 0) System.out.println(-1);
            else System.out.println(result);
        }
    }
}
