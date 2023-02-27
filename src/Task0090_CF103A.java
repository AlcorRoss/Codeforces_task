import java.util.Scanner;

public class Task0090_CF103A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();
        long counter = 0, temp;

        for (int i = 0; i < numberOfTests; i++) {
            temp = in.nextLong();
            counter += temp + ((temp - 1) * i);
        }

        System.out.println(counter);
    }
}
