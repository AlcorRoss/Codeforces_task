import java.util.*;

public class Task0052_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            in.nextInt();
            int result = 0;
            String line = in.next();
            Set<Character> mem = new HashSet<>();

            char[] chars = line.toCharArray();
            int[] differentValuesFromBegin = new int[chars.length];
            int[] differentValuesFromEnd = new int[chars.length];

            differentValuesFromBegin[0] = 1;
            differentValuesFromEnd[differentValuesFromEnd.length - 1] = 1;
            mem.add(chars[0]);

            for (int j = 1; j < chars.length; j++) {
                if (!mem.contains(chars[j])) {
                    differentValuesFromBegin[j] = differentValuesFromBegin[j - 1] + 1;
                    mem.add(chars[j]);
                }
            }

            mem.clear();
            for (int j = chars.length - 2; j >= 0; j--) {
                if (!mem.contains(chars[j])) {
                    differentValuesFromBegin[j] = differentValuesFromBegin[j + 1] + 1;
                    mem.add(chars[j]);
                }
            }

            for (int j = 0; j < differentValuesFromBegin.length - 1; j++) {
                result = Math.max(result, differentValuesFromBegin[j] + differentValuesFromEnd[j + 1]);
            }
            System.out.println(result);
        }
    }
}
