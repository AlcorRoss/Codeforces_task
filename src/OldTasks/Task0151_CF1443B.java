package OldTasks;

import java.util.Scanner;

public class Task0151_CF1443B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            int priceA = in.nextInt();
            int priceB = in.nextInt();
            String line = in.next();
            int result = 0, counter = 9999;

            for (int i = 0; i < line.length(); i++) {
                switch (line.charAt(i)) {
                    case ('1') -> {
                        result += Math.min(priceA, priceB * counter);
                        counter = 0;
                    }
                    case ('0') -> counter++;
                }
            }
            System.out.println(result);
        }
    }
}
