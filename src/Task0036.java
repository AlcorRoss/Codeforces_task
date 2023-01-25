import java.util.Scanner;
public class Task0036 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        String[] array = {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};

        while (number > 5) {
            number = number - 4;
            number = number / 2;
        }

        System.out.println(array[number - 1]);

    }
}
