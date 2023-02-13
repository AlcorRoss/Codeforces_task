package OldTasks;

import java.util.Scanner;

public class Task0032 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String temp;
        int result = 0, counter = 0, purpose;

        in.nextInt();
        int numberOfPlayers = in.nextInt();
        int numberOfDifferences = in.nextInt();
        int[] armies = new int[numberOfPlayers];

        for (int i = 0; i < numberOfPlayers; i++) {
            armies[i] = in.nextInt();
        }

        purpose = in.nextInt();

        for (int army : armies) {
            temp = Integer.toBinaryString(army ^ purpose);
            for (int i = 0; i < temp.length(); i++) {
                if (temp.charAt(i) == '1') counter++;
            }
            if (counter <= numberOfDifferences) result++;
            counter = 0;
        }

        System.out.println(result);
    }
}
