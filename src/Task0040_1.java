import java.util.Scanner;
import java.util.TreeMap;

public class Task0040_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeMap<Integer, Integer> lightsPosition = new TreeMap<>();
        int oldPosition;
        double maxRange = 0, beginRange;
        int quantityOfLights = in.nextInt();
        int streetLength = in.nextInt();

        for (int i = 0; i < quantityOfLights; i++) {
            lightsPosition.put(in.nextInt(), 1);
        }

        System.out.println(lightsPosition);

        oldPosition = lightsPosition.firstKey();
        for (int position : lightsPosition.keySet()) {
            System.out.println("Position = " + position);
            System.out.println("Range = " + (position - oldPosition - 1));
            maxRange = Math.max(position - oldPosition - 1, maxRange);
            System.out.println("maxRange = " + maxRange);
            oldPosition = position;
        }

        beginRange = Math.max(lightsPosition.firstKey(), streetLength - lightsPosition.lastKey());

        System.out.println(maxRange);
        System.out.println(beginRange);

        if (maxRange / 2 >= beginRange) {
            System.out.println(maxRange / 2);
        } else {
            System.out.println(maxRange);
        }
    }
}
