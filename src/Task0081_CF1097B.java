import java.util.Arrays;
import java.util.Scanner;

public class Task0081_CF1097B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfStep = in.nextInt();
        int[] steps = new int[numberOfStep];
        int sum, temp;
        boolean flag = false;

        for (int i = 0; i < numberOfStep; i++) {
            steps[i] = in.nextInt();
        }

        sum = Arrays.stream(steps).sum();

        if (sum == 0 || sum % 360 == 0) {
            System.out.println("YES");
        } else {
            temp = sum % 360;
            temp /= 2;
            int finalTemp = temp;
            steps = Arrays.stream(steps).filter(value -> value <= finalTemp).toArray();

            for (int i = steps.length - 1; i >= 0; i--) {
                if (steps[i] == temp || flag) {
                    System.out.println("YES");
                    flag = true;
                    break;
                }
                int temp2 = steps[i];
                for (int j = 0; j < i; j++) {
                    temp2 += steps[j];
                    if (temp2 == temp) {
                        flag = true;
                        break;
                    }
                }
            }
            if (!flag) System.out.println("NO");
        }
    }
}
