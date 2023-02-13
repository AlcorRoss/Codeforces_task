package OldTasks;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task0052 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            in.nextInt();
            int result = 0;
            String line = in.next();

            for (int j = 0; j < line.length() - 1; j++) {
                Set<Character> st = new HashSet<>();
                Set<Character> st2 = new HashSet<>();

                char[] chars = line.substring(0, j + 1).toCharArray();
                char[] chars2 = line.substring(j + 1).toCharArray();

                for (Character c : chars) {
                    st.add(c);
                }
                for (Character c : chars2) {
                    st2.add(c);
                }

                result = Math.max(result, st.size() + st2.size());
            }
            System.out.println(result);
        }
    }
}
