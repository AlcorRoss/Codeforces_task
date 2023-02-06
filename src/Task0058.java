import java.util.Scanner;

public class Task0058 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            int even = 0, odd = 0;
            int arrayLength = in.nextInt();
            int numberOfValues = in.nextInt();

            for (int j = 0; j < arrayLength; j++) {
                if (in.nextInt() % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }

            if (odd % 2 != 0 && numberOfValues - odd <= even
                    || odd > 1 && odd % 2 == 0 && numberOfValues - (odd - 1) <= even) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
