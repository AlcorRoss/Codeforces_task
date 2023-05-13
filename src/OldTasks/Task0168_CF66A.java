package OldTasks;

import java.math.BigInteger;
import java.util.Scanner;

public class Task0168_CF66A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger line = in.nextBigInteger();
        int byteN = line.compareTo(BigInteger.valueOf(-128));
        int byteP = line.compareTo(BigInteger.valueOf(127));
        if (byteN > -1 && byteP < 1) {
            System.out.println("byte");
            return;
        }
        int shortN = line.compareTo(BigInteger.valueOf(-32768));
        int shortP = line.compareTo(BigInteger.valueOf(32767));
        if (shortN > -1 && shortP < 1) {
            System.out.println("short");
            return;
        }
        int intN = line.compareTo(BigInteger.valueOf(-2147483648));
        int intP = line.compareTo(BigInteger.valueOf(2147483647));
        if (intN > -1 && intP < 1) {
            System.out.println("int");
            return;
        }
        int longN = line.compareTo(BigInteger.valueOf(Long.MIN_VALUE));
        int longP = line.compareTo(BigInteger.valueOf(Long.MAX_VALUE));
        if (longN > -1 && longP < 1) {
            System.out.println("long");
            return;
        }
        System.out.println("BigInteger");
    }
}
