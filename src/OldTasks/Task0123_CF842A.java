package OldTasks;

import java.util.Scanner;

public class Task0123_CF842A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long l = in.nextLong();
        long r = in.nextLong();
        long x = in.nextLong();
        long y = in.nextLong();
        long purpose = in.nextLong();

        if (purpose * x < l && purpose * y < l || purpose * x > r && purpose * y > r) {
            System.out.println("NO");
            return;
        }
        for (long i = x; i <= y; i++) {
            for (long j = l; j <= r; j++) {
                if (purpose * i == j) {
                    System.out.println("YES");
                    return;
                }
                if (purpose * i < j) break;
            }
        }
        System.out.println("NO");
    }
}
