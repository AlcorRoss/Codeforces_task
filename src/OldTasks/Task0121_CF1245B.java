package OldTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task0121_CF1245B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();
        while (numberOfTests-- > 0) {
            int numberOfRounds = in.nextInt();
            int rock = in.nextInt();
            int paper = in.nextInt();
            int scissors = in.nextInt();
            int counter = 0;
            char[] values = in.next().toCharArray();
            char[] result = new char[numberOfRounds];

            numberOfRounds -= numberOfRounds / 2;
            Arrays.fill(result, '0');
            for (int i = 0; i < values.length; i++) {
                switch (values[i]) {
                    case ('R') -> {
                        if (paper > 0) {
                            result[i] = 'P';
                            paper--;
                            counter++;
                        }
                    }
                    case ('P') -> {
                        if (scissors > 0) {
                            result[i] = 'S';
                            scissors--;
                            counter++;
                        }
                    }
                    case ('S') -> {
                        if (rock > 0) {
                            result[i] = 'R';
                            rock--;
                            counter++;
                        }
                    }
                }
            }
            if (counter < numberOfRounds) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                for (char c : result) {
                    if (c != '0') {
                        System.out.print(c);
                    } else {
                        if (rock > 0) {
                            System.out.print("R");
                            rock--;
                        } else if (paper > 0) {
                            System.out.print("P");
                            paper--;
                        } else {
                            System.out.print("S");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}

