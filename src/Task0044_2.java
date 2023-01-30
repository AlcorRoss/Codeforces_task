import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task0044_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Integer, Integer> memoryzationMap = new HashMap<>();
        int numberOfTests, temp, tempMem;
        int numberOfBox = in.nextInt();
        int[] boxes = new int[numberOfBox + 1];

        for (int i = 1; i < boxes.length; i++) {
            boxes[i] = in.nextInt();
        }

        numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            temp = in.nextInt();

            if (memoryzationMap.containsKey(temp)) {
                System.out.println(memoryzationMap.get(temp));
                continue;
            }

            for (int j = 1; j < boxes.length; j++) {
                tempMem = temp;
                temp -= boxes[j];
                if (temp <= 0) {
                    System.out.println(j);
                    memoryzationMap.put(tempMem, j);
                    break;
                }
            }
        }
    }
}
