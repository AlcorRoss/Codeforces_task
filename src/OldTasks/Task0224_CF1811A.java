package OldTasks;

import java.util.Scanner;

public class Task0224_CF1811A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int numberOfValues = in.nextInt();

        while (numberOfValues-- > 0) {
            in.nextInt();
            char additional = in.next().toCharArray()[0];
            StringBuilder digit = new StringBuilder(in.next());
            int length = digit.length();
            if (additional == '0') {
                digit.append(additional);
                System.out.println(digit);
                continue;
            }
            for (int i = 0; i < digit.length(); i++) {
                if (digit.charAt(i) < additional) {
                    digit.insert(i, additional);
                    break;
                }
            }
            if (digit.length()==length) digit.append(additional);
            System.out.println(digit);
        }
    }
}
