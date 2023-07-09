package OldTasks;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task0225_CF1702B {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int numberOfTest = in.nextInt();

        while (numberOfTest-- > 0) {
            char[] chars = in.next().toCharArray();
            int result = 0;

            for (int i = 0; i < chars.length; ) {
                Set<Character> tempSet = new HashSet<>();
                int counter = i;
                while (counter < chars.length) {
                    tempSet.add(chars[counter]);
                    if (tempSet.size() == 3) break;
                    counter++;
                }
                for (int j = i; j < chars.length; j++) {
                    if (tempSet.contains(chars[j])) i++;
                    else break;
                }
                result++;
            }
            System.out.println(result);
        }
    }
}
