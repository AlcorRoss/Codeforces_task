package OldTasks.Task0029;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task29 {
    public static void main(String[] args) {
        List<String> stringList = ReadInput.readInput();
        calculate(stringList);
    }

    public static void calculate(List<String> stringList) {
        int origin;
        List<Integer> array = new ArrayList<>();
        Set<Integer> integerSet = new HashSet<>();

        String[] temp = stringList.get(0).split(" ");

        for (String s : temp) {
            array.add(Integer.parseInt(s));
        }

        for (int i = 1; i < stringList.size(); i++) {
            origin = Integer.parseInt(stringList.get(i)) - 1;

            for (int j = origin; j < array.size(); j++) {
                integerSet.add(array.get(j));
            }

            System.out.println(integerSet.size());
            integerSet.clear();
        }
    }
}
