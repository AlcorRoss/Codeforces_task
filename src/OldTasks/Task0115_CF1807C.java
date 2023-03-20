package OldTasks;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task0115_CF1807C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            int lineLength = in.nextInt();
            char[] line = in.next().toCharArray();
            boolean flag = true;
            Set<Character> even = new HashSet<>();
            Set<Character> odd = new HashSet<>();

            if (lineLength == 1) {
                System.out.println("YES");
                continue;
            }
            for (int i = 0; i < line.length; i++) {
                if (i % 2 == 0) even.add(line[i]);
                else odd.add(line[i]);
            }
            for (Character character : odd) {
                if (even.contains(character)) {
                    System.out.println("NO");
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.println("YES");
        }
    }
}
