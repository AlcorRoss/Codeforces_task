import java.util.*;

public class Task0067_2 {
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
            int counter;
            List<Integer> temp = new ArrayList<>();

            for (int j = origin; j <= bound; j++) {
                temp.add(height[j]);
            }

            int minDif = Collections.max(temp) - Collections.min(temp);
            counter = minDif;

            while (counter > 0) {

                for (Integer j : temp) {
                    if (temp.contains(j + counter) || temp.contains(j - counter)) {
                        minDif = Math.min(minDif, counter);
                    }
                }

                counter--;
            }

            System.out.println(minDif);
        }
    }
}
