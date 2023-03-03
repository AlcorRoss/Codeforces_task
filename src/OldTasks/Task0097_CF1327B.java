package OldTasks;

import java.util.*;

public class Task0097_CF1327B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            int numberOfDaughters = in.nextInt();
            Set<Integer> freeDaughters = new HashSet<>();
            Set<Integer> busyDaughters = new HashSet<>();
            Set<Integer> busyKingdoms = new HashSet<>();
            Set<Integer> freeKingdoms = new HashSet<>();

            for (int i = 0; i < numberOfDaughters; i++) {
                boolean flag = true;
                freeDaughters.add(i + 1);
                freeKingdoms.add(i + 1);
                int numberOfValues = in.nextInt();
                while (numberOfValues-- > 0) {
                    int temp = in.nextInt();
                    if (!busyKingdoms.contains(temp) && flag) {
                        busyKingdoms.add(temp);
                        busyDaughters.add(i + 1);
                        flag = false;
                    }
                }
            }
            if (busyDaughters.size() == 0) {
                System.out.println("IMPROVE");
                System.out.println(1 + " " + 1);
                continue;
            }
            freeDaughters.removeAll(busyDaughters);
            freeKingdoms.removeAll(busyKingdoms);
            if (freeDaughters.size() != 0) {
                System.out.println("IMPROVE");
                List<Integer> temp = new ArrayList<>(freeDaughters);
                List<Integer> temp1 = new ArrayList<>(freeKingdoms);
                System.out.println(temp.get(0) + " " + temp1.get(0));
            } else {
                System.out.println("OPTIMAL");
            }
        }
    }
}
