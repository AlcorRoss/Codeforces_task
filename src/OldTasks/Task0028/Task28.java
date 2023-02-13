package OldTasks.Task0028;

import java.util.List;

public class Task28 {
    public static void main(String[] args) {
        List<String> stringList = ReadInput.readInput();
        calculate(stringList);
    }

    public static void calculate(List<String> stringList) {
        int counter = 0, origin, bound;
        char[] chars = stringList.get(0).toCharArray();

        for (int i = 2; i < stringList.size(); i++) {
            origin = Integer.parseInt(stringList.get(i).substring(0, 1)) - 1;
            bound = Integer.parseInt(stringList.get(i).substring(2));

            for (int j = origin; j < bound - 1; j++) {
                if (chars[j] == chars[j + 1]) counter++;
            }

            System.out.println(counter);
            counter = 0;
        }
    }
}
