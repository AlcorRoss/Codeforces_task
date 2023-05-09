package OldTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task0163_CF339A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder st = new StringBuilder();
        String[] values = in.next().split("\\+");
        Arrays.sort(values);
        for (int i = 0; i < values.length; i++) {
            if (i == values.length - 1) st.append(values[i]);
            else st.append(values[i]).append("+");
        }
        System.out.println(st);
    }
}
