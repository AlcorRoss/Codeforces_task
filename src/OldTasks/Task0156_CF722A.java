package OldTasks;

import java.util.Scanner;

public class Task0156_CF722A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int format = in.nextInt();
        String[] time = in.next().split(":");
        StringBuilder result = new StringBuilder();

        if (format == 24) {
            if (Integer.parseInt(time[0]) > 23) result.append(0).append(time[0].charAt(1)).append(":");
            else result.append(time[0]).append(":");
        } else {
            if (time[0].equals("00")) result.append("10").append(":");
            else if (Integer.parseInt(time[0]) > 12 && time[0].charAt(1) != '0')
                result.append(0).append(time[0].charAt(1)).append(":");
            else if (Integer.parseInt(time[0]) > 12)
                result.append(1).append(time[0].charAt(1)).append(":");
            else result.append(time[0]).append(":");
        }
        if (Integer.parseInt(time[1]) > 59) result.append(0).append(time[1].charAt(1));
        else result.append(time[1]);
        System.out.println(result);
    }
}
