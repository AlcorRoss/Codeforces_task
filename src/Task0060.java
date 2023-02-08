import java.util.Scanner;

public class Task0060 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            long temp, temp2;
            long purpose = in.nextLong();
            int numberOfSummand = in.nextInt();

            if (numberOfSummand == 1) {
                System.out.println("YES");
                System.out.println(purpose);
            } else if (purpose < numberOfSummand || purpose % 2 != 0 && numberOfSummand % 2 == 0) {
                System.out.println("NO");
            } else if (numberOfSummand % 2 == 0) {
                temp = purpose / numberOfSummand; // Проблема здесь. Например, 16/14=1
                temp2 = purpose % numberOfSummand;
                System.out.println("YES");
                for (int j = 0; j < numberOfSummand; j++) {
                    if (j == numberOfSummand - 1) System.out.println(temp + temp2);
                    else System.out.print(temp + " ");
                }
            } else if (purpose % 2 == 0 && numberOfSummand % 2 != 0) {
                temp = (numberOfSummand - 1) * 2L;
                if (purpose - 2 < temp) {
                    System.out.println("NO");
                } else {
                    temp = (purpose) / (numberOfSummand - 1);
                    temp2 = (purpose) % (numberOfSummand - 1);
                    System.out.println("YES");
                    for (int j = 0; j <= numberOfSummand; j++) {
                        if (j == numberOfSummand) System.out.println(temp2);
                        else System.out.print(temp + " ");
                    }
                }
            } else {
                temp = (purpose - 1) / (numberOfSummand - 1);
                System.out.println("YES");
                for (int j = 0; j <= numberOfSummand; j++) {
                    if (j == numberOfSummand) System.out.println(1);
                    else if (j % 2 == 0) System.out.print((temp + 1) + " ");
                    else System.out.print((temp - 1) + " ");
                }
            }
        }
    }
}
