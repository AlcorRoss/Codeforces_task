import java.util.Scanner;

public class Task0085_CF1455B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            int sum = 0, counter = 0, k = 0;
            int purpose = in.nextInt();

            while (sum < purpose) {
                k += 1;
                sum += k;
                counter++;
            }

            if (sum - purpose == 1) {
                System.out.println(counter + 1);
            } else {
                System.out.println(counter);
            }
        }
    }
}

