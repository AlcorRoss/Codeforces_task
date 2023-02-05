import java.util.Scanner;

public class Task0055 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            int temp;
            int maxRight = 0, maxLeft = 0;
            int numberOfCake = in.nextInt();
            int[] cakeCenter = new int[numberOfCake];

            int range = in.nextInt();
            range -= in.nextInt();

            for (int j = 0; j < cakeCenter.length; j++) {
                cakeCenter[j] = in.nextInt();
            }

            for (int k : cakeCenter) {
                temp = in.nextInt();
                if (temp < k) {
                    maxRight = Math.max(maxRight, temp - k);
                } else {
                    maxLeft = Math.min(maxLeft, temp - k);
                }
            }

            if (maxRight - range > maxLeft + range) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }

        }
    }
}

















