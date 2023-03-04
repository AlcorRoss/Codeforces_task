package OldTasks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task0098_CF1794A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = Integer.parseInt(in.nextLine());

        while (numberOfTests-- > 0) {
            in.nextLine();
            String line = "";
            boolean flag = true;
            String lines = in.nextLine();
            String[] parts = lines.split(" ");
            if (parts.length == 2) {
                if (parts[0].equals(parts[1])) System.out.println("YES");
                else System.out.println("NO");
                continue;
            }
            Arrays.sort(parts, Comparator.comparingInt(String::length));
            String[] temp = {parts[0] + parts[parts.length - 2], parts[parts.length - 2] + parts[0],
                    parts[1] + parts[parts.length - 2], parts[parts.length - 2] + parts[1]};
            for (String s : temp) {
                int counter = 0;
                for (String part : parts) {
                    Pattern pattern = Pattern.compile(part);
                    Matcher matcher = pattern.matcher(s);
                    if (matcher.find()) counter++;
                }
                if (counter == parts.length) {
                    line = s;
                    break;
                }
            }
            for (int i = 0; i < line.length() / 2; i++) {
                if (line.charAt(i) != line.charAt(line.length() - 1 - i)) {
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
