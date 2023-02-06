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

            if (numberOfValues % 2 == 0) {
                if (odd % 2 != 0 && even != 0 && numberOfValues - odd <= even) {
                    System.out.println("YES");
                } else if (odd % 2 == 0 && even != 0 && odd > 1 && numberOfValues - (odd - 1) <= even) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                if (odd % 2 != 0 && numberOfValues - odd <= even) {
                    System.out.println("YES");
                } else if (odd % 2 == 0 && odd > 1 && numberOfValues - (odd - 1) <= even) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }

        }
    }
}
