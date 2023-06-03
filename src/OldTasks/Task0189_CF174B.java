package OldTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task0189_CF174B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.next();
        String[] values = line.split("\\.");
        List<String> result = new ArrayList<>();

        if (line.charAt(0) == '.' || line.charAt(line.length() - 1) == '.') {
            System.out.println("NO");
            return;
        }
        if (values[0].length() > 8 || values[values.length - 1].length() > 3 || values.length < 2) {
            System.out.println("NO");
            return;
        } else {
            result.add(values[0]);
        }
        for (int i = 1; i < values.length - 1; i++) {
            if (values[i].length() > 11 || values[i].length() < 2) {
                System.out.println("NO");
                return;
            } else {
                if (values[i].length() >= 4) {
                    result.add(values[i].substring(0, 3));
                    result.add(values[i].substring(3));
                } else {
                    result.add(values[i].substring(0, 1));
                    result.add(values[i].substring(1));
                }
            }
        }
        result.add(values[values.length - 1]);
        System.out.println("YES");
        for (int i = 0; i < result.size(); i++) System.out.println(result.get(i) + "." + result.get(++i));
    }
}
