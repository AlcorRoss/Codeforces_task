package Task5;

import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<String> list = ReadInput.readInput();
        calculateX(list);
    }

    public static void calculateX(List<String> list) {
        int result = 0;

        for (String s : list) {
            if (s.charAt(0) == '+' || s.charAt(2) == '+') {
                result++;
            } else {
                result--;
            }
        }

        System.out.println(result);
    }
}
