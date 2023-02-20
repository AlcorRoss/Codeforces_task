import java.util.Scanner;

public class Task0079_CF1334A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            boolean flag = true;
            int numberOfValues = in.nextInt();
            int plays, clears, temp1, temp2, tempPlays = 0, tempClears = 0;

            while (numberOfValues-- > 0) {
                plays = in.nextInt();
                clears = in.nextInt();
                temp1 = plays - tempPlays;
                temp2 = clears - tempClears;

                if (temp2 < 0 || temp2 > temp1) {
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
