package OldTasks.Task0031;

import java.util.List;

public class Task31 {
    public static void main(String[] args) {
        List<String> stringList = ReadInput.readInput();
        calculate(stringList);
    }

    public static void calculate(List<String> stringList) {
        int sum, numberOfTerms;

        for (String s : stringList) {
            String[] temp = s.split(" ");
            sum = Integer.parseInt(temp[0]);
            numberOfTerms = Integer.parseInt(temp[1]);
            if (numberOfTerms * numberOfTerms <= sum && sum % 2 == numberOfTerms % 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
