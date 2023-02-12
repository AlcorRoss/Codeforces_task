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
            long temp1, temp2, temp3, tempDiscount;

            temp1 = purpose * firstDayPrice;
            temp2 = purpose * secondDayPrice;

            if (purpose <= quantityOfDiscount) {
                System.out.println(Math.max(temp1, temp2));
                continue;
            }

            if (purpose == quantityOfDiscount + 1) {
                temp1 = Math.min(temp1, firstDayPrice * quantityOfDiscount);
                temp1 = Math.min(temp1, temp2);
                System.out.println(temp1);
                continue;
            }

            temp3 = purpose - quantityOfDiscount - 1;
            tempDiscount = (temp3 * firstDayPrice) + (quantityOfDiscount * firstDayPrice);
            tempDiscount = Math.min(tempDiscount, (temp3 * secondDayPrice) + (quantityOfDiscount * firstDayPrice));

            temp1 = Math.min(temp1, temp2);
            temp1 = Math.min(temp1, tempDiscount);
            System.out.println(temp1);

        }
    }
}
