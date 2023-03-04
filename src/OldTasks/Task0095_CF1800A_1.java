package OldTasks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task0095_CF1800A_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^m+e+o+w+$");
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            in.nextInt();
            String line = in.next().toLowerCase();
            Matcher matcher = pattern.matcher(line);
            if(matcher.find()) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
