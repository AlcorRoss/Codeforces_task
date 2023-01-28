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

        oldPosition = lightsPosition.firstKey();
        for (int position : lightsPosition.keySet()) {
            maxRange = Math.max(position - oldPosition - 1, maxRange);
            oldPosition = position;
        }

        beginRange = Math.max(lightsPosition.firstKey(), streetLength - lightsPosition.lastKey());

        System.out.println(Math.max(maxRange / 2, beginRange));
    }
}
