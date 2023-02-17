
import java.util.Scanner;

public class Task0069_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxTestsCount = sc.nextInt();

        for (int i = 0; i < maxTestsCount; i++) {
            int maxMemberCount = sc.nextInt();
            int[] weights = new int[105];

            for (int j = 0; j < maxMemberCount; j++) {
                weights[sc.nextInt()]++;
            }

            int max = 0;
            for (int j = 1; j <= 105; j++) {
                int counter = 0;
                for (int k = 1; k <= j / 2; k++) {
                    if (j - k != k) {
                        counter += Math.min(weights[k], weights[j - k]);
                    }
                }
                max = Math.max(counter, max);
            }
            System.out.println(max);
        }
    }
}
