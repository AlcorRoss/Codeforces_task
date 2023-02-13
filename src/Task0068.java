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
                switch (c) {
                    case ('1') -> flag1 = true;
                    case ('2') -> flag2 = true;
                    case ('3') -> flag3 = true;
                }
                tempLine.add(c);

                if (flag1 && flag2 && flag3) {
                    int counter = 0;
                    for (int j = tempLine.size() - 1; j >= 0; j--) {
                        counter++;
                        switch (tempLine.get(j)) {
                            case ('1') -> flag1 = false;
                            case ('2') -> flag2 = false;
                            case ('3') -> flag3 = false;
                        }
                        if (!flag1 && !flag2 && !flag3) break;
                    }
                    minLength = Math.min(minLength, counter);
                    tempLine.clear();
                }
            }
            System.out.println(minLength);
        }
    }
}
