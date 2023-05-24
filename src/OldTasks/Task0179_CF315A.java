package OldTasks;

import java.util.*;

public class Task0179_CF315A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfBottle = in.nextInt();
        int temp = numberOfBottle;
        int result = 0;
        List<Bottle> bottleList = new ArrayList<>();

        while (temp-- > 0) bottleList.add(new Bottle(in.nextInt(), in.nextInt()));
        for (Bottle bottle : bottleList) {
            for (Bottle bottle1 : bottleList) {
                if (bottle.val1 == bottle1.val2 && !bottle.equals(bottle1)) {
                    result++;
                    break;
                }
            }
        }
        System.out.println(numberOfBottle - result);
    }

    static class Bottle {
        int val1;
        int val2;

        public Bottle(int val1, int val2) {
            this.val1 = val1;
            this.val2 = val2;
        }
    }
}
