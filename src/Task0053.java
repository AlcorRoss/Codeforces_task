import java.util.Scanner;

public class Task0053 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            int numberOfCards = in.nextInt();

            int countA = 1;
            int countB = 0;
            int j = 2;

            while (countA + countB <= numberOfCards) {
                if (j + countB + countA > numberOfCards) {
                    countB = (numberOfCards - countA - countB) + countB;
                    break;
                }
                countB += j;
                j++;

                if (j + countB + countA > numberOfCards) {
                    countB = (numberOfCards - countA - countB) + countB;
                    break;
                }
                countB += j;
                j++;

                if (j + countB + countA > numberOfCards) {
                    countA = (numberOfCards - countA - countB) + countA;
                    break;
                }
                countA += j;
                j++;

                if (j + countB + countA > numberOfCards) {
                    countA = (numberOfCards - countA - countB) + countA;
                    break;
                }
                countA += j;
                j++;
            }

            System.out.println(countA + " " + countB);
        }
    }
}
