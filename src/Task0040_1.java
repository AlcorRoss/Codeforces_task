import java.util.Scanner;
import java.util.TreeMap;

public class Task0040_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeMap<Integer, Integer> lightsPosition = new TreeMap<>();
        int oldPosition;
        double maxRange = 0;
        int quantityOfLights = in.nextInt();
        int streetLength = in.nextInt();

        for (int i = 0; i < quantityOfLights; i++) {
            lightsPosition.put(in.nextInt(), 1);
        }

        oldPosition = lightsPosition.firstKey();
        for (int position : lightsPosition.keySet()) {
            maxRange = Math.max(position - oldPosition, maxRange);
            oldPosition = position;
        }

        if (maxRange / 2 >= Math.max(lightsPosition.firstKey(), streetLength - lightsPosition.lastKey())) {
            System.out.println(maxRange / 2);
        } else {
            System.out.println(maxRange);
        }
    }
}
