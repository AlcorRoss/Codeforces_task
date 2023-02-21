import java.util.Scanner;

public class Task0080_CF1409C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOFTests = in.nextInt();

        while (numberOFTests-- > 0) {
            int arrayLength = in.nextInt();
            int firstValue = in.nextInt();
            int secondValue = in.nextInt();
            int temp;

            if (arrayLength == 2) {
                System.out.println(firstValue + " " + secondValue);
            } else {
                temp = Math.max(firstValue, secondValue) - Math.min(firstValue, secondValue);
                for (int i = arrayLength - 2; i > 0; i--) {
                    if (temp % i == 0) {
                        temp = i;
                        break;
                    }
                }

                System.out.println(temp);
            }
        }
    }
}
