package OldTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task0143_CF25A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfValues = in.nextInt();
        int temp;
        List<Integer> values = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        while (numberOfValues-- > 0) {
            temp = in.nextInt();
            values.add(temp);
            if (temp % 2 == 0) even.add(temp);
            else odd.add(temp);
        }
        if (even.size() == 1) System.out.println(values.indexOf(even.get(0)) + 1);
        else System.out.println(values.indexOf(odd.get(0)) + 1);
    }
}
