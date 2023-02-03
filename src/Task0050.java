import java.util.Scanner;

public class Task0050 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            boolean flag = true;
            int vertical = 0;
            int horizontal = 0;
            int lineLength = in.nextInt();
            String line = in.next();

            for (int j = 0; j < lineLength; j++) {
                switch (line.charAt(j)) {
                    case 'L' -> horizontal--;
                    case 'R' -> horizontal++;
                    case 'U' -> vertical++;
                    case 'D' -> vertical--;
                }

                if (vertical == 1 && horizontal == 1) {
                    System.out.println("YES");
                    flag = false;
                    break;
                }
            }

            if (flag) System.out.println("NO");
        }
    }
}
