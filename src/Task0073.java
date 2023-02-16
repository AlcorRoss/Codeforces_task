import java.util.Scanner;

public class Task0073 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            boolean flag = false;
            int numberOfValues = in.nextInt();
            int purpose = in.nextInt();
            int temp;

            for (int j = 0; j < numberOfValues; j++) {
                temp = in.nextInt();
                if (temp == purpose) flag = true;

                temp = in.nextInt();
                if (temp == purpose) flag = true;
            }

            if (flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
