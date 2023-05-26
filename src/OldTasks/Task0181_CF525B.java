package OldTasks;

import java.util.*;

public class Task0181_CF525B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder st = new StringBuilder(in.next());
        int numberOfDays = in.nextInt();
        int[] indexes = new int[st.length() / 2];

        while (numberOfDays-- > 0) indexes[in.nextInt() - 1]++;
        for (int i = 1; i < indexes.length; i++) indexes[i] += indexes[i - 1];
        for (int i = 0; i < indexes.length; i++) {
            if (indexes[i] % 2 != 0) {
                char temp = st.charAt(i);
                st.setCharAt(i, st.charAt(st.length() - i - 1));
                st.setCharAt(st.length() - i - 1, temp);
            }
        }
        System.out.println(st);
    }

}
