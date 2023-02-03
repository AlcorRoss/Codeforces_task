import java.util.Scanner;

public class Task0052 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            in.nextInt();
            StringBuilder st = new StringBuilder();
            StringBuilder st2 = new StringBuilder();
            String line = in.next();

            for (int j = 0; j < line.length(); j++) {
                if (st.indexOf(line.substring(0, 1)) == -1) {
                    st.append(line.charAt(0));
                    line = line.substring(1);
                } else {
                    break;
                }
            }

            for (int j = 0; j < line.length(); j++) {
                if (st2.indexOf(line.substring(0, 1)) == -1) {
                    st2.append(line.charAt(0));
                }
            }

            System.out.println(st.length() + st2.length());
        }
    }
}
