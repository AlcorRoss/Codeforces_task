import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task0071 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            long firstValue = in.nextLong();
            long purposeValue = in.nextLong();
            long temp = firstValue;

            for (int j = 0; j < purposeValue; j++) {
                temp = calculateNextValue(temp);
            }
            System.out.println(temp);
        }
    }

    public static long calculateNextValue(long temp) {
        String line = String.valueOf(temp);
        List<Integer> tempList = line.chars().mapToObj(c -> Integer.parseInt(String.valueOf(c))).toList();
        return temp + ((long) Collections.max(tempList) * Collections.min(tempList));
    }
}
