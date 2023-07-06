package OldTasks;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task0222_CF1644A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int numberOfValues = in.nextInt();

        while (numberOfValues-- > 0) {
            boolean isImpossible = false;
            Set<Character> characterSet = new HashSet<>();
            char[] chars = in.next().toCharArray();
            for (char aChar : chars) {
                if (Character.isLowerCase(aChar)) characterSet.add(aChar);
                else if (!characterSet.contains(Character.toLowerCase(aChar))) {
                    isImpossible = true;
                    break;
                }
            }
            System.out.println(isImpossible ? "NO" : "YES");
        }
    }
}
