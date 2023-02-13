package OldTasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task0043_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        boolean flag;
        int x, y;
        double result;

        for (int i = 0; i < t; i++) {
            Map<Integer, Integer> memory = new HashMap<>();
            int n = in.nextInt();
            flag = true;
            x = 1;
            y = 1;

            while (x <= 30) {

                if (memory.containsKey(x) && memory.get(x) == y || memory.containsKey(y) && memory.get(y) == x) {
                    y++;
                    continue;
                }

                memory.put(x, y);
                memory.put(y, x);

                result = (Math.pow(x, y) * y) + (Math.pow(y, x) * x);

                if (result == n) {
                    System.out.println(x + " " + y);
                    flag = false;
                    break;
                }

                if (y == 30) {
                    x++;
                    y = 1;
                }
                y++;
            }

            if (flag) {
                System.out.println(-1);
            }
        }
    }
}
