import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task0056 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            List<Integer> temp = new ArrayList<>();
            int result = 0;
            int numberOfMonsters = in.nextInt();
            int[] monsters = new int[numberOfMonsters];

            for (int j = 0; j < monsters.length; j++) {
                monsters[j] = in.nextInt();
            }

            Arrays.sort(monsters);

            for (int monster : monsters) {
                if (monster > 1) temp.add(monster - 1);
            }

            if (temp.get(0) != 1) {
                result = temp.get(0) - 1;
                temp.set(0, 1);
            }

            for (int j = 1; j < temp.size(); j++) {
                if (temp.get(j) > temp.get(j - 1) + 1) {
                    result += temp.get(j) - temp.get(j - 1) + 1;
                    temp.set(j, temp.get(j - 1) + 1);
                }
            }

            System.out.println(result);
        }
    }
}
