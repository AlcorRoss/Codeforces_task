package OldTasks;

import java.util.Scanner;

public class Task0217_CF1741A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int numberOfTest = in.nextInt();

        while (numberOfTest-- > 0) {
            String line = in.next();
            String line2 = in.next();
            if (line.equals(line2)) {
                System.out.println("=");
                continue;
            }
            var size = line.charAt(line.length() - 1);
            var size2 = line2.charAt(line2.length() - 1);
            if (size > size2) System.out.println("<");
            else if (size < size2) System.out.println(">");
            else if (size == 'S') System.out.println(line.length() > line2.length() ? "<" : ">");
            else if (size == 'L') System.out.println(line.length() > line2.length() ? ">" : "<");
        }
    }
}
