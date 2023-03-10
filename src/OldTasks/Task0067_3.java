package OldTasks;

import java.util.Scanner;

public class Task0067_3 {
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
            int minDif = Integer.MAX_VALUE, minDif2 = Integer.MAX_VALUE, maxHeight = 0;

            if ((bound - origin) == 1) {
                System.out.println(Math.abs(height[origin] - height[bound]));
                continue;
            }

            for (int j = origin; j <= bound; j++) {
                maxHeight = Math.max(maxHeight, height[j]);
            }

            for (int j = origin; j <= bound; j++) {
                if ((maxHeight - height[j]) != 0)
                    minDif = Math.min(minDif, maxHeight - height[j]);
            }

            for (int j = origin; j <= bound; j++) {
                if ((maxHeight - height[j]) > minDif && (maxHeight - height[j]) != 0)
                    minDif2 = Math.min(minDif2, maxHeight - height[j]);
            }

            System.out.println(Math.abs(Math.abs(minDif) - Math.abs(minDif2)));
        }
    }
}