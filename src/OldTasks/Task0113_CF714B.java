package OldTasks;

import java.util.*;

public class Task0113_CF714B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfValues = in.nextInt();
        Set<Integer> values = new TreeSet<>();

        while (numberOfValues-- > 0) values.add(in.nextInt());
        List<Integer> temp = new ArrayList<>(values);
        if (values.size() > 3
                || temp.size() == 3 && (temp.get(1) - temp.get(0)) != (temp.get(2) - temp.get(1)))
            System.out.println("NO");
        else System.out.println("YES");
    }
}
