import java.util.Scanner;

public class Task0240_CF1005A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int numberOFValues = in.nextInt();
        StringBuilder stringBuilder = new StringBuilder();
        int result = 0;
        int prev = 0;

        while (numberOFValues-- > 0) {
            int temp = in.nextInt();
            if (temp == 1) result++;
            if (prev >= temp) stringBuilder.append(prev).append(" ");
            prev = temp;
        }
        stringBuilder.append(prev);
        System.out.println(result);
        System.out.println(stringBuilder);
    }
}
