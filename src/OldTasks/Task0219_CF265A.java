package OldTasks;

import java.util.Scanner;

public class Task0219_CF265A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int index = 0;
        char[] line = in.next().toCharArray();
        char[] instructions = in.next().toCharArray();

        for (char instruction : instructions) if (instruction == line[index]) index++;
        System.out.println(index + 1);
    }
}
