import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task0052 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            in.nextInt();
            StringBuilder st = new StringBuilder();
            Set<Character> st2 = new HashSet<>();
            String line = in.next();

            for (int j = 0; j < line.length(); j++) {
                if (st.indexOf(line.substring(0, 1)) == -1) {
                    st.append(line.charAt(0));
                    line = line.substring(1);
                } else {
                    break;
                }
            }

            char[] array = line.toCharArray();

            for (Character c : array) {
                st2.add(c);
            }

            System.out.println(st.length() + st2.size());
        }
    }
}
