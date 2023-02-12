import java.util.*;

public class Task0067_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfPerson = in.nextInt();
        int numberOFDays = in.nextInt();
        int[] height = new int[numberOfPerson + 1];

        for (int i = 1; i < height.length; i++) {
            height[i] = in.nextInt();
        }

        for (int i = 0; i < numberOFDays; i++) {
            int origin = in.nextInt();
            int bound = in.nextInt();
            int minDif = Integer.MAX_VALUE;
            int[] difHeight = new int[bound - origin + 1];
            int count = 0;

            for (int j = origin; j <= bound; j++) {
                difHeight[count] = height[j];
                count++;
            }

            Arrays.sort(difHeight);

            for (int j = 1; j < difHeight.length; j++) {
                minDif = Math.min(minDif, difHeight[j] - difHeight[j - 1]);
            }

            System.out.println(minDif);
        }
    }
}
