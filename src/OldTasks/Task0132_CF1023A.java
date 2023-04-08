package OldTasks;

import java.util.Scanner;

public class Task0132_CF1023A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        in.nextInt();
        String sLine = in.next();
        String tLine = in.next();
        int purposeIndex = sLine.indexOf('*');

        if (sLine.length() - 1 > tLine.length() || purposeIndex == -1 && sLine.length() != tLine.length()) {
            System.out.println("NO");
            return;
        }
        for (int i = 0; i < purposeIndex; i++) {
            if (sLine.charAt(i) != tLine.charAt(i)) {
                System.out.println("NO");
                return;
            }
        }
        int j = tLine.length() - 1;
        for (int i = sLine.length() - 1; i > purposeIndex; i--, j--) {
            if (sLine.charAt(i) != tLine.charAt(j)) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
