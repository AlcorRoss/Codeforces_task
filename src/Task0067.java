import java.util.*;

public class Task0067 {
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
            Set<Integer> heightSet = new TreeSet<>();

            for (int j = origin; j <= bound; j++) {
                heightSet.add(height[j]);
            }

            List<Integer> temp = new ArrayList<>(heightSet);

            for (int j = 1; j < temp.size(); j++) {
                minDif = Math.min(minDif, temp.get(j) - temp.get(j - 1));
            }

            System.out.println(minDif);
        }
    }
}
