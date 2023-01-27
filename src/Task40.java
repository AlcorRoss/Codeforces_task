import java.util.Scanner;

public class Task40 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maxRange = 0, temp = 0, beginIndex = 0;
        int quantityOfLight = in.nextInt();
        int[] streetLength = new int[in.nextInt() + 1];

        for (int i = 0; i < quantityOfLight; i++) {
            streetLength[in.nextInt()] = 1;
        }

        for (int i = 0; i < streetLength.length; i++) {
            if (streetLength[i] == 0) {
                temp++;
            } else {
                if (temp > maxRange) beginIndex = i - temp;
                maxRange = Math.max(temp, maxRange);
                temp = 0;
            }
        }

        if (beginIndex != 0 && beginIndex + maxRange != streetLength.length - 1) {
            System.out.println((double) maxRange / 2);
        } else {
            System.out.println((double) maxRange);
        }
    }
}
