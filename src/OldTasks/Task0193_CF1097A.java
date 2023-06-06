package OldTasks;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task0193_CF1097A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        char[] purpose = in.nextLine().toCharArray();
        char[] temp = in.nextLine().toCharArray();
        Set<Character> tempSet = new HashSet<>();

        for (char c : temp) tempSet.add(c);
        for (char c : purpose) {
            if (tempSet.contains(c)) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
