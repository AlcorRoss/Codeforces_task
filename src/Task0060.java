import java.util.Scanner;

public class Task0060 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            long temp;
            long purpose = in.nextLong();
            int numberOfSummand = in.nextInt();

            if (numberOfSummand == 1) {
                System.out.println("YES");
                System.out.println(purpose);
            } else if (purpose < numberOfSummand || purpose % 2 != 0 && numberOfSummand % 2 == 0) {
                System.out.println("NO");
            } else if (purpose % 2 == 0 && numberOfSummand % 2 == 0) {
                temp = numberOfSummand * 2L;
                if (purpose == numberOfSummand) {
                    System.out.println("YES");
                    for (int j = 0; j < numberOfSummand; j++) {
                        if (j == numberOfSummand - 1) System.out.println(1);
                        else System.out.print(1 + " ");
                    }
                } else if (purpose == temp) {
                    System.out.println("YES");
                    for (int j = 0; j < numberOfSummand; j++) {
                        if (j == numberOfSummand - 1) System.out.println(2);
                        else System.out.print(2 + " ");
                    }
                } else if (purpose - temp < 2) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                    for (int j = 0; j < numberOfSummand; j++) {
                        if (j == numberOfSummand - 1) System.out.println(2 + purpose - temp);
                        else System.out.print(2 + " ");
                    }
                }
            } else if (purpose % 2 != 0 && numberOfSummand % 2 != 0) {
                if (purpose == numberOfSummand) {
                    System.out.println("YES");
                    for (int j = 0; j < numberOfSummand; j++) {
                        if (j == numberOfSummand - 1) System.out.println(1);
                        else System.out.print(1 + " ");
                    }
                } else if (purpose - numberOfSummand < 2) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                    for (int j = 0; j < numberOfSummand; j++) {
                        if (j == numberOfSummand - 1) System.out.println(1 + purpose - numberOfSummand);
                        else System.out.print(1 + " ");
                    }
                }
            } else if (purpose % 2 == 0 && numberOfSummand % 2 != 0) {
                temp = numberOfSummand * 2L;
                if (purpose == temp) {
                    System.out.println("YES");
                    for (int j = 0; j < numberOfSummand; j++) {
                        if (j == numberOfSummand - 1) System.out.println(2);
                        else System.out.print(2 + " ");
                    }
                } else if (purpose - temp < 2) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                    for (int j = 0; j < numberOfSummand; j++) {
                        if (j == numberOfSummand - 1) System.out.println(2 + purpose - temp);
                        else System.out.print(2 + " ");
                    }
                }
            }
        }
    }
}
