package OldTasks;

import java.util.Scanner;

public class Task0214_CF1760B {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            in.nextInt();
            char max = 'a';
            for (char c : in.next().toCharArray()) if (c > max) max = c;
            System.out.println(alphabet.indexOf(max) + 1);
        }
    }
}
