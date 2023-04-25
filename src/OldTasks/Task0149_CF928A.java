package OldTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task0149_CF928A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.next().toLowerCase();
        String temp;
        int numberOfValues = in.nextInt();
        int count = 0;
        List<String> values = new ArrayList<>();

        while (numberOfValues-- > 0) {
            temp = in.next().toLowerCase();
            if (temp.length() == line.length()) values.add(temp);
        }
        temp = line;
        for (int i = 0; i < line.length(); i++, count++) {
            switch (line.charAt(i)) {
                case ('0'), ('o') -> {
                    temp = temp.substring(0, count) + "[0o]" + temp.substring(count + 1);
                    count += 3;
                }
                case ('1'), ('i'), ('l') -> {
                    temp = temp.substring(0, count) + "[i1l]" + temp.substring(count + 1);
                    count += 4;
                }
            }
        }
        Pattern pattern = Pattern.compile(temp);
        for (String value : values) {
            Matcher matcher = pattern.matcher(value);
            if (matcher.find()) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
