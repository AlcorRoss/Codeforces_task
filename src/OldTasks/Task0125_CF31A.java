package OldTasks;

import java.util.*;

public class Task0125_CF31A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfValues = in.nextInt();
        int temp, tempIndex = 0;
        List<Integer> values = new ArrayList<>();

        while (numberOfValues-- > 0) values.add(in.nextInt());
        while (values.size() >= 3) {
            temp = values.get(0);
            values.remove(0);
            tempIndex++;
            for (Integer value : values) {
                if (values.contains(temp + value)) {
                    System.out.println((values.indexOf(temp + value) + 1 + tempIndex) + " "
                            + (values.indexOf(value) + tempIndex + 1) + " " + tempIndex);
                    return;
                } else if (values.contains(temp - value)) {
                    System.out.println(tempIndex + " " + (values.indexOf(value) + tempIndex + 1) + " "
                            + (values.indexOf(temp - value) + 1 + tempIndex));
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}
