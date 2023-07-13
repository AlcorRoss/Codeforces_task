package OldTasks;

import java.util.Scanner;

public class Task0229_CF1758A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int numberOfValues = in.nextInt();

        while (numberOfValues-- > 0) {
            char[] line = in.next().toCharArray();
            StringBuilder stringBuilder = new StringBuilder();
            for (char c : line) {
                stringBuilder.insert(0, c);
                stringBuilder.append(c);

            }
            System.out.println(stringBuilder);
        }
    }
}
