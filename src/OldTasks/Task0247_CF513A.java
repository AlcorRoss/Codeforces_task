package OldTasks;

import java.util.Scanner;

public class Task0247_CF513A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        var first = in.nextInt();
        var second = in.nextInt();
        in.nextInt();
        in.nextInt();
        System.out.println(first > second ? "First" : "Second");
    }
}
