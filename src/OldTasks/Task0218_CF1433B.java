package OldTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task0218_CF1433B {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int numberOfTest = in.nextInt();

        while (numberOfTest-- > 0) {
            int numberOfValues = in.nextInt();
            List<Integer> values = new ArrayList<>();
            boolean isOne = false;
            int bound = 0, result = 0;
            while (numberOfValues-- > 0) {
                int temp = in.nextInt();
                if (temp == 1) isOne = true;
                if (isOne) values.add(temp);
            }
            if (!isOne) {
                System.out.println(0);
                continue;
            }
            for (int i = values.size() - 1; i >= 0; i--) {
                if (values.get(i) == 1) {
                    bound = i;
                    break;
                }
            }
            for (int i = 0; i < bound; i++) if (values.get(i) == 0) result++;
            System.out.println(result);
        }
    }
}
