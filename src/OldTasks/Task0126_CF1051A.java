package OldTasks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task0126_CF1051A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTest = in.nextInt();
        Pattern pattern = Pattern.compile("[A-Z]");
        Pattern pattern2 = Pattern.compile("[a-z]");
        Pattern pattern3 = Pattern.compile("[0-9]");
        String[] result = {"a", "A", "1", "aA", "a1", "Aa", "A1", "1a", "1A"};
        String temp;
        while (numberOfTest-- > 0) {
            String line = in.next();
            Matcher matcher = pattern.matcher(line);
            Matcher matcher2 = pattern2.matcher(line);
            Matcher matcher3 = pattern3.matcher(line);
            if (matcher.find() && matcher2.find() && matcher3.find()) {
                System.out.println(line);
                continue;
            }
            for (String s : result) {
                temp = s + line.substring(s.length());
                matcher = pattern.matcher(temp);
                matcher2 = pattern2.matcher(temp);
                matcher3 = pattern3.matcher(temp);
                if (matcher.find() && matcher2.find() && matcher3.find()) {
                    System.out.println(temp);
                    break;
                }
                if (s.length() == 1) {
                    temp = line.charAt(0) + s + line.substring(2);
                    matcher = pattern.matcher(temp);
                    matcher2 = pattern2.matcher(temp);
                    matcher3 = pattern3.matcher(temp);
                    if (matcher.find() && matcher2.find() && matcher3.find()) {
                        System.out.println(temp);
                        break;
                    }
                }
            }
        }
    }
}
