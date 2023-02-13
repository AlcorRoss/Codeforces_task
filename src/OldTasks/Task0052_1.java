package OldTasks;

import java.util.*;

public class Task0052_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            in.nextInt();
            int result;
            List<Character> st = new ArrayList<>();
            List<Character> st2 = new LinkedList<>();
            String line = in.next();

            char[] chars = line.toCharArray();

            for (int j = 1; j < chars.length; j++) {
                st2.add(chars[j]);
            }
            st.add(chars[0]);

            result = st.size() + new HashSet<>(st2).size();

            for (int j = 1; j < line.length() - 1; j++) {
                st.add(chars[j]);
                st2.remove(0);

                result = Math.max(new HashSet<>(st).size() + new HashSet<>(st2).size(), result);
            }
            System.out.println(result);
        }
    }
}
