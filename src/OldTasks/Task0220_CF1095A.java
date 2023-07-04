package OldTasks;

import java.util.Scanner;

public class Task0220_CF1095A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        in.nextInt();
        String line = in.next();
        StringBuilder stringBuilder = new StringBuilder();
        int index = 0, counter = 1;
        while (index < line.length()) {
            stringBuilder.append(line.charAt(index));
            counter++;
            index += counter;
        }
        System.out.println(stringBuilder);
    }
}
