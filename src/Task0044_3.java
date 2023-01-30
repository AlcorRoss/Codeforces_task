import java.util.Scanner;
import java.util.TreeMap;

public class Task0044_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeMap<Integer, Integer> memorizationMap = new TreeMap<>();
        int numberOfTests, temp, mem;
        int numberOfBox = in.nextInt();
        int[] boxes = new int[numberOfBox + 1];

        for (int i = 1; i < boxes.length; i++) {
            if (i == 1) {
                boxes[i] = in.nextInt();
            } else {
                boxes[i] = in.nextInt() + boxes[i - 1];
            }
        }

        numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            temp = in.nextInt();
            mem = 1;

            if (memorizationMap.containsKey(temp)) {
                System.out.println(memorizationMap.get(temp));
                continue;
            } else if (memorizationMap.lastKey() < temp) {
                mem = memorizationMap.get(memorizationMap.lastKey());
            }

            for (int j = mem; j < boxes.length; j++) {
                if (boxes[j] >= temp) {
                    memorizationMap.put(temp, j);
                    System.out.println(j);
                    break;
                }
            }
        }
    }
}
