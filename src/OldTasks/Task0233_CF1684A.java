package OldTasks;

import java.util.Scanner;

public class Task0233_CF1684A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        var numberOfValues = in.nextInt();
        while (numberOfValues-- > 0) {
            var chars = in.next().toCharArray();
            if (chars.length == 2) {
                System.out.println(chars[1]);
            } else {
                int min = Integer.MAX_VALUE;
                for (char aChar : chars) min = Math.min(min, Integer.parseInt(String.valueOf(aChar)));
                System.out.println(min);
            }
        }
    }
}
