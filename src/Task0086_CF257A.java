import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task0086_CF257A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfPowerStrip = in.nextInt();
        int numberOfDevices = in.nextInt();
        int numberOfPowerSocket = in.nextInt();
        int sum, temp = 0;
        boolean flag = true;
        Integer[] powerStrips = new Integer[numberOfPowerStrip];

        for (int i = 0; i < powerStrips.length; i++) powerStrips[i] = in.nextInt();

        if (numberOfDevices <= numberOfPowerSocket) {
            System.out.println(0);
        } else {
            Arrays.sort(powerStrips, Collections.reverseOrder());
            for (int i = 0; i < numberOfPowerSocket; i++) {
                temp += powerStrips[i];
                sum = (numberOfPowerSocket - (i + 1)) + temp;
                if (sum >= numberOfDevices) {
                    System.out.println(i + 1);
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.println(-1);
        }
    }
}
