import java.util.*;

public class Task0056 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            List<Integer> monsters = new ArrayList<>();
            int result = 0;
            int numberOfMonsters = in.nextInt();

            for (int j = 0; j < numberOfMonsters; j++) {
                monsters.add(in.nextInt());
            }

            Collections.sort(monsters);

            while (monsters.size() != 0) {

                if (monsters.get(0) == 1) {
                    System.out.println(monsters);
                    monsters = decrementAll(monsters);
                    System.out.println(monsters);
                } else {
                    result += monsters.get(0) - 1;
                    monsters.set(0, 1);
                }
            }

            System.out.println(result);
        }
    }

    public static List<Integer> decrementAll(List<Integer> monsters) {
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < monsters.size(); i++) {
            monsters.set(i, monsters.get(i) - 1);
            if (monsters.get(i) != 0) temp.add(monsters.get(i));
        }

        return temp;
    }
}