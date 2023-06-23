package OldTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task0210_CF1611A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int numberOfTest = in.nextInt();

        while (numberOfTest-- > 0) {
            boolean isEven = false;
            char[] chars = in.next().toCharArray();
            List<Integer> numbers = new ArrayList<>();
            for (char aChar : chars) {
                int temp = Integer.parseInt(String.valueOf(aChar));
                numbers.add(temp);
                if (temp % 2 == 0) isEven = true;
            }
            if (!isEven) System.out.println(-1);
            else if (numbers.get(numbers.size() - 1) % 2 == 0) System.out.println(0);
            else if (numbers.get(0) % 2 == 0) System.out.println(1);
            else System.out.println(2);
        }
    }
}
