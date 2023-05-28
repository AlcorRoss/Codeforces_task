package OldTasks;

import java.util.Scanner;

public class Task0183_CF538A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] chars = in.next().toCharArray();
        String purpose = "CODEFORCES";
        int index = 0;

        if (chars.length < purpose.length()) {
            System.out.println("NO");
            return;
        }
        for (char aChar : chars) {
            if (index == 10) {
                System.out.println("YES");
                return;
            }
            if (aChar == purpose.charAt(index)) index++;
            else break;
        }
        int index2 = 10 - index;
        for (int i = chars.length - index2; i < chars.length; i++) {
            if (chars[i] != purpose.charAt(index)) {
                System.out.println("NO");
                return;
            } else {
                index++;
            }
        }
        System.out.println("YES");
    }
}
