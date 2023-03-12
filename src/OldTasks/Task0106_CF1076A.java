package OldTasks;

import java.util.Scanner;

public class Task0106_CF1076A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lineLength = in.nextInt();
        StringBuilder line = new StringBuilder(in.next());

        for (int i = 0; i < line.length() - 1; i++) {
            if (line.charAt(i) > line.charAt(i + 1)) {
                line.deleteCharAt(i);
                break;
            }
        }
        if (line.length() == lineLength) {
            line.deleteCharAt(lineLength - 1);
        }
        System.out.println(line);
    }
}
