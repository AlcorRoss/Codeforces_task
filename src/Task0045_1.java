import java.util.Scanner;

public class Task0045_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int units = 0, numberOfZero = 0, maxZero = -1, temp;

        for (int i = 0; i < n; i++) {
            temp = in.nextInt();

            if (temp == 0) {
                numberOfZero++;
                maxZero = Math.max(numberOfZero, maxZero);
            } else {
                units++;
                numberOfZero = Math.max(numberOfZero - 1, 0);
            }
        }

        System.out.println(units + maxZero);
    }
}

