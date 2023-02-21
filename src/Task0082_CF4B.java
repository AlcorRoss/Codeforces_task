import java.util.Scanner;

public class Task0082_CF4B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfDays = in.nextInt();
        int sumTime = in.nextInt();
        int[] min = new int[numberOfDays];
        int[] max = new int[numberOfDays];
        int temp = 0;

        for (int i = 0; i < numberOfDays; i++) {
            min[i] = in.nextInt();
            max[i] = in.nextInt();
            temp += max[i] - min[i];
        }

        if(temp<sumTime) System.out.println("NO");
    }
}
