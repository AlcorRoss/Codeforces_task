import java.util.Scanner;

public class Task0066 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            long firstDayPrice = in.nextLong();
            long secondDayPrice = in.nextLong();
            long purpose = in.nextLong();
            long quantityOfDiscount = in.nextLong();
            long temp1, temp2, temp3, temp4, tempDiscount;

            temp1 = purpose * firstDayPrice;
            temp2 = purpose * secondDayPrice;

            if (purpose <= quantityOfDiscount) {
                System.out.println(Math.min(temp1, temp2));
                continue;
            }

            if (purpose % (quantityOfDiscount + 1) == 0) {
                temp3 = Math.max(1, purpose / (quantityOfDiscount + 1));
                temp1 = Math.min(temp1, firstDayPrice * quantityOfDiscount * temp3);
                temp1 = Math.min(temp1, temp2);
                System.out.println(temp1);
                continue;
            }


            temp3 = purpose / (quantityOfDiscount + 1);
            temp4 = purpose % (quantityOfDiscount + 1);
            temp3 *= quantityOfDiscount;

            tempDiscount = (temp3 * firstDayPrice) + (temp4 * firstDayPrice);
            tempDiscount = Math.min(tempDiscount, (temp4 * secondDayPrice) + (temp3 * firstDayPrice));

            temp1 = Math.min(temp1, temp2);
            temp1 = Math.min(temp1, tempDiscount);
            System.out.println(temp1);
        }
    }
}
