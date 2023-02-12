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
            int minDif = Integer.MAX_VALUE, minDif2 = Integer.MAX_VALUE;

            if ((bound - origin) == 1) {
                System.out.println(Math.abs(height[origin] - height[bound]));
                continue;
            }

            for (int j = origin + 1; j <= bound; j++) {
                minDif = Math.min(minDif, height[origin] - height[j]);
            }

            for (int j = origin + 1; j <= bound; j++) {
                if ((height[origin] - height[j]) > minDif)
                    minDif2 = Math.min(minDif2, height[origin] - height[j]);
            }

            System.out.println(Math.abs(Math.abs(minDif) - Math.abs(minDif2)));
        }
    }
}