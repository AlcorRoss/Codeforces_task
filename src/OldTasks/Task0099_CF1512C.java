package OldTasks;

import java.util.Scanner;

public class Task0099_CF1512C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            int numberOf0 = in.nextInt();
            int numberOf1 = in.nextInt();
            int temp0 = 0, temp1 = 0;
            boolean flag = false;
            String line = in.next();
            char[] chars = line.toCharArray();

            for (int i = 0; i < chars.length / 2; i++) {
                char temp2 = chars[i];
                char temp3 = chars[chars.length - 1 - i];
                if (temp2 == '?' || temp3 == '?') continue;
                if (temp2 != temp3) {
                    flag = true;
                    System.out.println(-1);
                    break;
                }
            }
            if (flag) continue;
            for (int i = 0; i < chars.length / 2; i++) {
                if (chars[i] == '?') chars[i] = chars[chars.length - 1 - i];
                else if (chars[chars.length - 1 - i] == '?') chars[chars.length - 1 - i] = chars[i];
            }
            if ((numberOf0 + numberOf1) % 2 != 0 && chars[chars.length / 2] == '?') {
                if (numberOf0 % 2 != 0) chars[chars.length / 2] = '0';
                else chars[chars.length / 2] = '1';
            }
            for (char c : chars) {
                if (c == '0') temp0++;
                if (c == '1') temp1++;
            }
            temp1 = numberOf1 - temp1;
            temp0 = numberOf0 - temp0;
            for (int i = 0; i < chars.length / 2; i++) {
                if (chars[i] == '?' && temp0 > 0) {
                    chars[i] = chars[chars.length - 1 - i] = '0';
                    temp0 -= 2;
                }
                if (chars[i] == '?' && temp1 > 0) {
                    chars[i] = chars[chars.length - 1 - i] = '1';
                    temp1 -= 2;
                }
            }
            temp1 = 0;
            temp0 = 0;
            for (char c : chars) {
                if (c == '0') temp0++;
                if (c == '1') temp1++;
            }
            if (temp0 > numberOf0 || temp1 > numberOf1) {
                System.out.println(-1);
                continue;
            }
            System.out.println(String.valueOf(chars));
        }
    }
}