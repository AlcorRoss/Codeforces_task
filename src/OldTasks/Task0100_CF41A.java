package OldTasks;

import java.util.Scanner;

public class Task0100_CF41A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        String word1 = in.next();
        String word2 = in.next();
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(word2.length() - 1 - i)) {
                flag = false;
                break;
            }
        }
        if (flag) System.out.println("YES");
        else System.out.println("NO");
    }
}
