package OldTasks;

import java.util.Scanner;
import java.util.Stack;

public class Task0169_CF81A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.next();
        Stack<Character> stack = new Stack<>();
        while (true) {
            char[] temp = line.toCharArray();
            StringBuilder st = new StringBuilder();
            for (char c : temp) {
                if (stack.empty()) stack.push(c);
                else if (c == stack.peek()) stack.pop();
                else stack.push(c);
            }
            for (Character character : stack) st.append(character);
            stack.clear();
            if (line.contentEquals(st)) break;
            line = st.toString();
        }
        System.out.println(line);
    }
}
