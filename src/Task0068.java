import java.util.*;

public class Task0068 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTest = in.nextInt();

        for (int i = 0; i < numberOfTest; i++) {
            boolean flag1 = false, flag2 = false, flag3 = false;
            int minLength = Integer.MAX_VALUE;
            String line = in.next();
            Character[] chars = line.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
            List<Character> tempLine = new ArrayList<>();

            if (!Arrays.asList(chars).contains('1') || !Arrays.asList(chars).contains('2')
                    || !Arrays.asList(chars).contains('3')) {
                System.out.println(0);
                continue;
            }

            for (char c : chars) {
                if (flag1 && flag2 && flag3) {
                    minLength = Math.min(minLength, tempLine.size());
                    tempLine.clear();
                    flag1 = flag2 = flag3 = false;
                }

                switch (c) {
                    case ('1') -> flag1 = true;
                    case ('2') -> flag2 = true;
                    case ('3') -> flag3 = true;
                }

                tempLine.add(c);
            }
        }
    }
}
