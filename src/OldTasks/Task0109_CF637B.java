package OldTasks;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Task0109_CF637B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfChats = in.nextInt();
        String[] chats = new String[numberOfChats];
        LinkedHashSet<String> result = new LinkedHashSet<>();

        for (int i = 0; i < chats.length; i++) chats[i] = in.next();
        for (int i = chats.length - 1; i >= 0; i--) result.add(chats[i]);
        for (String s : result) System.out.println(s);
    }
}
