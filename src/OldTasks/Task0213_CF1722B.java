package OldTasks;

import java.util.Scanner;

public class Task0213_CF1722B {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int numberOfTest = in.nextInt();

        while (numberOfTest-- > 0) {
            in.nextInt();
            boolean isEqual = true;
            char[] line1 = in.next().toCharArray();
            char[] line2 = in.next().toCharArray();
            for (int i = 0; i < line1.length; i++) {
                if (line1[i] != line2[i] && line1[i] == 'R' || line1[i] != line2[i] && line2[i] == 'R') {
                    isEqual = false;
                    break;
                }
            }
            System.out.println(isEqual ? "YES" : "NO");
        }
    }
}
