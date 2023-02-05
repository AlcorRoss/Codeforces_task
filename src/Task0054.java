import java.util.Scanner;

public class Task0054 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            int numberOfCards = in.nextInt();

            int countAWhite = 1;
            int countABlack = 0;
            int countBWhite = 0;
            int countBBlack = 0;
            int j = 2;

            while (true) {

                if (j + countAWhite + countABlack + countBWhite + countBBlack > numberOfCards) {
                    j = numberOfCards - (countAWhite + countABlack + countBWhite + countBBlack);
                    if (j % 2 == 0) {
                        countBWhite += j / 2;
                        countBBlack += j / 2;
                    } else {
                        countBWhite += j / 2;
                        countBBlack += (j / 2) + 1;
                    }
                    break;
                }
                if (j % 2 == 0) {
                    countBWhite += j / 2;
                    countBBlack += j / 2;
                    j++;
                } else {
                    countBWhite += j / 2;
                    countBBlack += (j / 2) + 1;
                    j++;
                }


                if (j + countAWhite + countABlack + countBWhite + countBBlack > numberOfCards) {
                    j = numberOfCards - (countAWhite + countABlack + countBWhite + countBBlack);
                    if (j % 2 == 0) {
                        countBWhite += j / 2;
                        countBBlack += j / 2;
                    } else {
                        countBWhite += j / 2;
                        countBBlack += (j / 2) + 1;
                    }
                    break;
                }
                if (j % 2 == 0) {
                    countBWhite += j / 2;
                    countBBlack += j / 2;
                    j++;
                } else {
                    countBWhite += j / 2;
                    countBBlack += (j / 2) + 1;
                    j++;
                }


                if (j + countAWhite + countABlack + countBWhite + countBBlack > numberOfCards) {
                    j = numberOfCards - (countAWhite + countABlack + countBWhite + countBBlack);
                    if (j % 2 == 0) {
                        countAWhite += j / 2;
                        countABlack += j / 2;
                    } else {
                        countAWhite += (j / 2) + 1;
                        countABlack += j / 2;
                    }
                    break;
                }
                if (j % 2 == 0) {
                    countAWhite += j / 2;
                    countABlack += j / 2;
                    j++;
                } else {
                    countAWhite += (j / 2) + 1;
                    countABlack += j / 2;
                    j++;
                }


                if (j + countAWhite + countABlack + countBWhite + countBBlack > numberOfCards) {
                    j = numberOfCards - (countAWhite + countABlack + countBWhite + countBBlack);
                    if (j % 2 == 0) {
                        countAWhite += j / 2;
                        countABlack += j / 2;
                    } else {
                        countAWhite += (j / 2) + 1;
                        countABlack += j / 2;
                    }
                    break;
                }
                if (j % 2 == 0) {
                    countAWhite += j / 2;
                    countABlack += j / 2;
                    j++;
                } else {
                    countAWhite += (j / 2) + 1;
                    countABlack += j / 2;
                    j++;
                }
            }

            System.out.println(countAWhite + " " + countABlack + " " + countBWhite + " " + countBBlack);
        }
    }
}
