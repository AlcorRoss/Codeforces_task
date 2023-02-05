import java.util.Scanner;

public class Task0055 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            boolean flag = true;
            int maxRight = 0, maxLeft = 0;
            int numberOfCake = in.nextInt();
            int[] cakeCenter = new int[numberOfCake];
            int[] dispenserCenter = new int[numberOfCake];
            int[] different = new int[numberOfCake];

            int range = in.nextInt();
            range -= in.nextInt();

            for (int j = 0; j < cakeCenter.length; j++) {
                cakeCenter[j] = in.nextInt();
            }

            for (int j = 0; j < dispenserCenter.length; j++) {
                dispenserCenter[j] = in.nextInt();
                different[j] = dispenserCenter[j] - cakeCenter[j];
                if (dispenserCenter[j] < cakeCenter[j]) {
                    maxRight = Math.max(maxRight, dispenserCenter[j] - cakeCenter[j]);
                } else {
                    maxLeft = Math.min(maxLeft, dispenserCenter[j] - cakeCenter[j]);
                }
            }

            for (int dif : different) {
                if (dif < 0 && Math.abs(dif - range) < Math.abs(maxLeft)) {
                    flag = false;
                    System.out.println("NO");
                } else if (dif > 0 && dif + range > maxRight) {
                    flag = false;
                    System.out.println("NO");
                }
            }

            if (flag) System.out.println("YES");
        }
    }
}