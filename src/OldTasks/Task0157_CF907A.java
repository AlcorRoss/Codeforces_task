package OldTasks;

import java.util.Scanner;

public class Task0157_CF907A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int volume = in.nextInt();
        int volume2 = in.nextInt();
        int volume3 = in.nextInt();
        int volume4 = in.nextInt();

        if (Math.abs(volume4 - volume3) <= Math.min(volume3, volume4) && Math.max(volume3, volume4) < volume2) {
            System.out.println(volume * 2);
            System.out.println(volume2 * 2);
            System.out.println(Math.max(volume3, volume4));
        } else {
            System.out.println(-1);
        }
    }
}
