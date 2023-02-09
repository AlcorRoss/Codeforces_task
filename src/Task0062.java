import java.util.Scanner;

public class Task0062 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTest = in.nextInt();

        for (int i = 0; i < numberOfTest; i++) {
            int temp, temp2;
            int purpose = in.nextInt();

            if (purpose % 2 == 0) {
                System.out.println(purpose / 2 + " " + purpose / 2);
                continue;
            }

            temp = purpose / 2;
            temp2 = temp + 1;

            String line = String.valueOf(temp);
            String line2 = String.valueOf(temp2);

            if (line.length() == line2.length()) {
                System.out.println(line + " " + line2);
                continue;
            }

            char[] chars = line.toCharArray();
            char[] chars2 = line2.toCharArray();

            for (int j = 1; j < chars2.length; j++) {
                temp = Integer.parseInt(String.valueOf(chars[j - 1])) + Integer.parseInt(String.valueOf(chars2[j]));

                if (temp % 2 == 0) {
                    chars[j - 1] = Character.forDigit(temp / 2, 10);
                    chars2[j] = Character.forDigit(temp / 2, 10);
                    continue;
                }

                if (j % 2 != 0) {
                    chars[j - 1] = Character.forDigit(temp / 2 + 1, 10);
                    chars2[j] = Character.forDigit(temp / 2, 10);
                } else {
                    chars2[j] = Character.forDigit(temp / 2 + 1, 10);
                    chars[j - 1] = Character.forDigit(temp / 2, 10);
                }
            }

            StringBuilder st = new StringBuilder();

            for (char c : chars) {
                st.append(c);
            }
            st.append(" ");

            for (char c : chars2) {
                st.append(c);
            }

            System.out.println(st);
        }
    }
}
