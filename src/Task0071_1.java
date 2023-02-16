import java.util.Scanner;

public class Task0071_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            long firstValue = in.nextLong();
            long purposeValue = in.nextLong();
            long temp = firstValue;

            for (int j = 1; j < purposeValue; j++) {
                if (temp == calculateNextValue(temp)) break;
                temp = calculateNextValue(temp);
            }
            System.out.println(temp);
        }
    }

    public static long calculateNextValue(long temp) {
        long temp2 = temp;
        long min = 10, max = 0;

        while (temp2 > 0) {
            min = Math.min(min, temp2 % 10);
            max = Math.max(max, temp2 % 10);
            temp2 /= 10;
        }
        return temp + (min * max);
    }
}

//test git
