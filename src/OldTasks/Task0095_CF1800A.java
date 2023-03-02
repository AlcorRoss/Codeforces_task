package OldTasks;

import java.util.*;

public class Task0095_CF1800A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            in.nextInt();
            String line = in.next().toLowerCase();
            char[] chars = line.toCharArray();
            StringBuilder st = new StringBuilder();
            char temp = 'a';

            for (char c : chars) {
                if (c != temp) st.append(c);
                temp = c;
            }

            if(st.toString().equals("meow")) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
