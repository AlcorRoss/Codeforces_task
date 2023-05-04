package OldTasks;

import java.util.Scanner;

public class Task0158_CF71A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfValues = in.nextInt();

        while (numberOfValues-- > 0) {
            String temp = in.next();
            StringBuilder st = new StringBuilder();
            if (temp.length() > 10)
                st.append(temp.charAt(0)).append(temp.length() - 2).append(temp.charAt(temp.length() - 1));
            if (st.isEmpty()) System.out.println(temp);
            else System.out.println(st);
        }
    }
}
