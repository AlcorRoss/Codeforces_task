package OldTasks;

import java.util.Scanner;

public class Task0223_CF1234A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            int numberOfValues = in.nextInt();
            int sum = 0;
            for (int i = 0; i < numberOfValues; i++) sum += in.nextInt();
            System.out.println(sum % numberOfValues == 0
                    ? sum / numberOfValues
                    : (sum + (numberOfValues - (sum % numberOfValues))) / numberOfValues);
        }
    }
}
