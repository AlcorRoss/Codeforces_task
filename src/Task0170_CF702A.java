import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task0170_CF702A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfValues = in.nextInt();
        List<Integer> result = new ArrayList<>();
        int prev = Integer.MIN_VALUE;
        int temp, counter = 0;

        while (numberOfValues-- > 0) {
            temp = in.nextInt();
            if (temp > prev) {
                counter++;
            } else {
                result.add(counter);
                counter = 1;
            }
            prev = temp;
        }
        result.add(counter);
        System.out.println(Collections.max(result));
    }
}
