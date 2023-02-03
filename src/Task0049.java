import java.util.Scanner;

public class Task0049 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = "codeforces";
        char[] array = line.toCharArray();
        char temp;
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            boolean flag = false;
            temp = in.nextLine().charAt(0);

            for (char c : array) {
                if (temp == c) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
