package OldTasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task0118_CF387B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfRequired = in.nextInt();
        int numberOfAvailable = in.nextInt();
        int temp;
        List<Integer> required = new ArrayList<>();
        List<Integer> available = new ArrayList<>();

        while (numberOfRequired-- > 0) required.add(in.nextInt());
        while (numberOfAvailable-- > 0) {
            temp = in.nextInt();
            if (required.contains(temp)) required.set(required.indexOf(temp), Integer.MAX_VALUE);
            else if (temp > Collections.min(required)) available.add(temp);
        }
        Collections.sort(available);
        for (Integer integer : available) {
            temp = Collections.min(required);
            if (integer > temp) {
                required.set(required.indexOf(temp), Integer.MAX_VALUE);
            }
        }
        temp = 0;
        for (Integer integer : required) if (integer != Integer.MAX_VALUE) temp++;
        System.out.println(temp);
    }
}
