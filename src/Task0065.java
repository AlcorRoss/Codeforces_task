import java.util.Scanner;

public class Task0065 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            int numberOfDigit = in.nextInt();
            boolean flag = true, flag2 = false;
            StringBuilder st1 = new StringBuilder().append(1);
            StringBuilder st2 = new StringBuilder().append(1);
            String line = in.next();
            char[] chars = line.toCharArray();

            for (int j = 1; j < numberOfDigit; j++) {
                switch (chars[j]) {
                    case ('0') -> {
                        st1.append(0);
                        st2.append(0);
                    }
                    case ('1') -> {
                        flag2 = true;
                        if (flag) {
                            st1.append(2);
                            st2.append(1);
                            flag = false;
                        } else {
                            st1.append(1);
                            st2.append(2);
                        }
                    }
                    case ('2') -> {
                        if (flag2) {
                            st1.append(0);
                            st2.append(2);
                        } else {
                            st1.append(1);
                            st2.append(1);
                        }
                    }
                }
            }

            System.out.println(st1);
            System.out.println(st2);
        }
    }
}
