package OldTasks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task0137_CF8A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.next();
        String sequence = in.next();
        String sequence1 = in.next();
        StringBuilder reverseSequence = new StringBuilder();
        StringBuilder reverseSequence1 = new StringBuilder();
        boolean flag, flag1;

        for (int i = sequence.length() - 1; i >= 0; i--) reverseSequence.append(sequence.charAt(i));
        for (int i = sequence1.length() - 1; i >= 0; i--) reverseSequence1.append(sequence1.charAt(i));
        Pattern pattern = Pattern.compile(sequence + "[a-z]*" + sequence1);
        Matcher matcher = pattern.matcher(line);
        Pattern pattern1 = Pattern.compile(reverseSequence1 + "[a-z]*" + reverseSequence);
        Matcher matcher1 = pattern1.matcher(line);
        flag = matcher.find();
        flag1 = matcher1.find();
        if (flag && flag1) System.out.println("both");
        else if (flag) System.out.println("forward");
        else if (flag1) System.out.println("backward");
        else System.out.println("fantasy");
    }
}
