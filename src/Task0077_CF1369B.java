import java.util.Scanner;

public class Task0077_CF1369B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            in.nextInt();
            int firstOne = -1, lastZero = -1;
            String line = in.next();

            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == '1' && firstOne == -1) firstOne = i;
                else if (line.charAt(i) == '0' && firstOne != -1) lastZero = i;
            }

            if (firstOne == -1 || lastZero == -1) System.out.println(line);
            else System.out.println(line.substring(0, firstOne) + line.substring(lastZero));
        }
    }
}