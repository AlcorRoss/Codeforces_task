import java.util.Scanner;

public class Task0092_CF405B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        String line = in.next();
        char[] dom = line.toCharArray();
        int counter = 0, temp = 0;
        boolean flagL = false, flagR = false;

        for (char c : dom) {
            if (c == '.') {
                temp++;
            } else if (c == 'R' && !flagR && !flagL) {
                counter += temp;
                flagR = true;
            } else if (c == 'L' && !flagR && !flagL) {
                temp = 0;
                flagL = true;
            } else if (c == 'R') {
                counter += temp;
                temp = 0;
                flagL = false;
                flagR = true;
            } else if (c == 'L') {
                counter += temp % 2;
                temp = 0;
                flagL = true;
                flagR = false;
            }
        }
        if (flagL || !flagR) counter += temp;
        System.out.println(counter);
    }
}
