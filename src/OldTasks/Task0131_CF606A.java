package OldTasks;

import java.util.Scanner;

public class Task0131_CF606A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int blue = in.nextInt();
        int violet = in.nextInt();
        int orange = in.nextInt();
        int purposeBlue = in.nextInt();
        int purposeViolet = in.nextInt();
        int purposeOrange = in.nextInt();

        if (blue >= purposeBlue) {
            blue -= purposeBlue;
            purposeBlue = 0;
        } else {
            purposeBlue -= blue;
            blue = 0;
        }
        if (violet >= purposeViolet) {
            violet -= purposeViolet;
            purposeViolet = 0;
        } else {
            purposeViolet -= violet;
            violet = 0;
        }
        if (orange >= purposeOrange) {
            orange -= purposeOrange;
            purposeOrange = 0;
        } else {
            purposeOrange -= orange;
            orange = 0;
        }
        blue /= 2;
        violet /= 2;
        orange /= 2;
        if (blue + orange + violet >= purposeBlue + purposeOrange + purposeViolet) System.out.println("YES");
        else System.out.println("NO");
    }
}
