import java.util.*;

public class Task0056_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            int result = 0, temp = 0;
            int numberOfMonsters = in.nextInt();
            int[] monsters = new int[numberOfMonsters];

            for (int j = 0; j < monsters.length; j++) {
                monsters[j] = in.nextInt();
            }

            Arrays.sort(monsters);
            System.out.println(Arrays.toString(monsters));
            for (int monster : monsters) {
                if (monster - temp == 1) {
                    temp++;
                } else if (monster == 1) {
                    temp = 1;
                } else {
                    result += monster - temp - 1;
                    temp++;
                }
            }

            System.out.println(result);
        }
    }
}