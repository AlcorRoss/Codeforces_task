package OldTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task0127_CF875A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int purpose = in.nextInt();
        String line;
        int temp = 0;
        List<Integer> result = new ArrayList<>();

        for (int i = Math.max(0, purpose - 100); i < purpose; i++) {
            line = String.valueOf(i);
            for (int j = 0; j < line.length(); j++) {
                temp += Integer.parseInt(String.valueOf(line.charAt(j)));
            }
            if ((temp + i) == purpose) result.add(i);
            temp = 0;
        }
        System.out.println(result.size());
        result.forEach(System.out::println);
    }
}
