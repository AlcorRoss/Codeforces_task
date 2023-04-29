package OldTasks;

import java.util.Scanner;

public class Task0153_CF612A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lineLength = in.nextInt();
        int length1 = in.nextInt();
        int length2 = in.nextInt();
        String line = in.next();

        for (int i = 0; i * length1 <= lineLength; i++) {
            if (i * length1 == lineLength) {
                System.out.println(i);
                for (int j = 0; j < lineLength; j += length1) System.out.println(line.substring(j, j + length1));
                return;
            }
            for (int j = 0; (j * length2 + i * length1) <= lineLength; j++) {
                if ((j * length2 + i * length1) == lineLength) {
                    System.out.println(i + j);
                    for (int k = 0; k < i * length1; k += length1) System.out.println(line.substring(k, k + length1));
                    for (int k = i * length1; k < lineLength; k += length2)
                        System.out.println(line.substring(k, k + length2));
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}
