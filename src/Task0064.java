import java.util.Scanner;

public class Task0064 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        int length, x3, x4, y3, y4;

        if (x1 == x2) {
            if (y1 < y2) length = y2 - y1;
            else length = y1 - y2;

            x3 = x4 = x1 + length;
            y3 = y1;
            y4 = y2;
            if (-1000 <= x3)
                System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
            else
                System.out.println(-1);
        } else if (y1 == y2) {
            if (x1 < x2) length = x2 - x1;
            else length = x1 - x2;

            y3 = y4 = y1 + length;
            x3 = x1;
            x4 = x2;
            if (-1000 <= y3)
                System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
            else
                System.out.println(-1);
        } else {
            x4 = x1;
            y4 = y2;
            x3 = x2;
            y3 = y1;

            if (Math.max(x3, x1) - Math.min(x3, x1) != Math.max(y4, y1) - Math.min(y4, y1))
                System.out.println(-1);
            else
                System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
        }
    }
}
