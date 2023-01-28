import java.util.Scanner;

public class Task0040 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maxRange = 0, temp = 0, beginRange = 0, endRange = 0;
        int quantityOfLight = in.nextInt();
        int[] streetLength = new int[in.nextInt() + 1];

        for (int i = 0; i < quantityOfLight; i++) {
            streetLength[in.nextInt()] = 1;
        }

        for (int j : streetLength) {
            if (j == 0) {
                temp++;
                maxRange = Math.max(temp, maxRange);
            } else {
                maxRange = Math.max(temp, maxRange);
                temp = 0;
            }
        }

        for (int j : streetLength) {
            if (j == 0) {
                beginRange++;
            } else {
                break;
            }
        }

        for (int i = streetLength.length - 1; i >= 0; i--) {
            if (streetLength[i] == 0) {
                endRange++;
            } else {
                break;
            }
        }

        if (maxRange / 2 >= Math.max(beginRange, endRange)) {
            System.out.println((double) maxRange / 2);
        } else {
            System.out.println((double) Math.max(beginRange, endRange));
        }
    }
}
