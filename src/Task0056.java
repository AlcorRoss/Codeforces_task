import java.util.Arrays;
import java.util.Scanner;

public class Task0056 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            int result = 0;
            int numberOfMonsters = in.nextInt();
            int[] monsters = new int[numberOfMonsters];

            for (int j = 0; j < monsters.length; j++) {
                monsters[j] = in.nextInt();
            }

            Arrays.sort(monsters);

            System.out.println(Arrays.toString(monsters));

            if (monsters[0] != 1) {
                result = monsters[0] - 1;
                monsters[0] = 1;
            }

            for (int j = 1; j < monsters.length; j++) {
                if (monsters[j] > monsters[j - 1] + 1) {
                    result += monsters[j] - monsters[j - 1] + 1;
                    monsters[j] = monsters[j - 1] + 1;
                }
            }

            System.out.println(result);
        }
    }
}
