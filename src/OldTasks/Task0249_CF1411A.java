package OldTasks;

import java.util.Scanner;

public class Task0249_CF1411A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        var numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            var numberOfValues = in.nextInt();
            var strings = in.next().split("");
            int result = 0;
            for (int i = strings.length - 1; i >= 0; i--) {
                if (strings[i].equals(")")) result++;
                else break;
            }
            System.out.println(result > numberOfValues / 2 ? "Yes" : "No");
        }
    }
}
