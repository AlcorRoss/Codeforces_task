package OldTasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task0043 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        boolean flag;
        int x, y, counter;
        double result = 0;

        for (int i = 0; i < t; i++) {
            Map<Integer, Integer> memory = new HashMap<>();
            int n = in.nextInt();
            flag = true;
            x = y = 1;
            counter = 0;

            while (result != n) {

                if (x >= n) {
                    System.out.println(-1);
                    flag = false;
                    break;
                }

                if (counter < 19) {
                    x++;
                } else {
                    y++;
                    x -= 19;
                    counter = 0;
                }

                if (memory.containsKey(x) && memory.get(x) == y || memory.containsKey(y) && memory.get(y) == x) {
                    continue;
                }

                result = (Math.pow(x, y) * y) + (Math.pow(y, x) * x);
                memory.put(x, y);
                memory.put(y, x);
                counter++;
            }

            if (flag) {
                System.out.println(x + " " + y);
            }
        }
    }
}
