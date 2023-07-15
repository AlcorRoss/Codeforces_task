package OldTasks;

import java.util.Scanner;

public class Task0231_CF448A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int medals = 0, cup = 0;
        for (int i = 0; i < 3; i++) cup += in.nextInt();
        for (int i = 0; i < 3; i++) medals += in.nextInt();
        medals = (medals / 10) + (medals % 10 != 0 ? 1 : 0);
        cup = (cup / 5) + (cup % 5 != 0 ? 1 : 0);
        System.out.println(medals + cup <= in.nextInt() ? "YES" : "NO");
    }
}
