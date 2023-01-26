import java.util.Scanner;

public class Task0038 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long stick, diamond, maxShovel, maxSword;
        int quantityOfTests = in.nextInt();
        long[] results = new long[quantityOfTests];

        for (int i = 0; i < quantityOfTests; i++) {
            stick = in.nextInt();
            diamond = in.nextInt();

            if (stick == 0 || diamond == 0) {
                results[i] = 0;
                continue;
            }

            if (diamond % 2 == stick % 2) {
                maxShovel = Math.min(stick / 2, diamond);
                maxSword = Math.min(stick, diamond / 2);

                if (maxShovel >= maxSword) {
                    results[i] = maxShovel + Math.min(stick - maxShovel * 2, diamond - maxShovel);
                } else {
                    results[i] = maxSword + Math.min(stick - maxSword, diamond - maxSword * 2);
                }
                continue;
            }

            if (diamond % 2 == 1) {
                maxShovel = Math.min(diamond / 2 + 1, stick / 2);
                maxSword = Math.min((diamond - maxShovel) / 2, stick - maxShovel);
            } else {
                maxSword = Math.min(stick / 2 + 1, diamond / 2);
                maxShovel = Math.min((stick - maxSword) / 2, diamond - maxSword);
            }
            results[i] = maxShovel + maxSword;
        }

        for (long result : results) {
            System.out.println(result);
        }

    }
}
