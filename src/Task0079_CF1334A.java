import java.util.Scanner;

public class Task0079_CF1334A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            boolean flag = true;
            int numberOfValues = in.nextInt();
            int plays, clears, temp1, temp2, tempPlays = 0, tempClears = 0;

            for (int i = 0; i < numberOfValues; i++) {
                plays = in.nextInt();
                clears = in.nextInt();
                temp1 = plays - tempPlays;
                temp2 = clears - tempClears;

                if (temp2 < 0 && flag || temp2 > temp1 && flag) {
                    System.out.println("NO");
                    flag = false;
                }
                tempPlays = plays;
                tempClears = clears;
            }

            if (flag) System.out.println("YES");
        }
    }
}