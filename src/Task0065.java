import java.util.Scanner;

public class Task0065 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            in.nextInt();
            StringBuilder st1 = new StringBuilder();
            StringBuilder st2 = new StringBuilder();
            String line = in.next();
            char[] chars = line.toCharArray();
            for (char c : chars) {
                switch (c) {
                    case ('0') -> {
                        st1.append(2);
                        st2.append(1);
                    }
                    case ('1') -> {
                        st1.append(0);
                        st2.append(1);
                    }
                    case ('2') -> {
                        st1.append(1);
                        st2.append(1);
                    }
                }
            }

            System.out.println(st1);
            System.out.println(st2);
        }
    }
}
