import java.util.Scanner;

public class Task0080_CF1409C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOFTests = in.nextInt();

        while (numberOFTests-- > 0) {
            int arrayLength = in.nextInt();
            int firstValue = in.nextInt();
            int secondValue = in.nextInt();
            int temp, temp2 = 0, temp3 = 0;

            if (arrayLength == 2) {
                System.out.println(firstValue + " " + secondValue);
            } else {
                if (Math.max(firstValue, secondValue) % arrayLength == 0) {
                    temp = Math.max(firstValue, secondValue) / arrayLength;
                    for (int i = 1; i <= arrayLength; i++) {
                        if (i == arrayLength) System.out.println(temp * i);
                        else System.out.print(temp * i + " ");
                    }
                } else {
                    temp = Math.max(firstValue, secondValue) - Math.min(firstValue, secondValue);
                    for (int i = 2; i < arrayLength; i++) {
                        if (temp % i == 0) {
                            temp2 = i;
                            temp3 = temp / i;
                        }
                    }
                    if (temp2 == 0 || temp3 == 0) {
                        for (int i = 0; i < arrayLength; i++) {
                            if (i == arrayLength - 1) System.out.println((firstValue + (arrayLength * i)));
                            else System.out.print((firstValue + (arrayLength * i)) + " ");
                        }
                    } else {
                        for (int i = 0; i < arrayLength; i++) {
                            temp = arrayLength - temp3 - i;
                            if ((firstValue - (temp * temp3)) > 0) {
                                temp = firstValue - (temp * temp3);
                                break;
                            }
                        }

                        for (int i = 0; i < arrayLength; i++) {
                            if (i == arrayLength - 1) System.out.println((temp + (temp3 * i)));
                            else System.out.print((temp + (temp3 * i)) + " ");
                        }
                    }
                }
            }
        }
    }
}
