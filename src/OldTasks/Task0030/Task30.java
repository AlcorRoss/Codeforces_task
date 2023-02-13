package OldTasks.Task0030;

import java.util.ArrayList;
import java.util.List;

public class Task30 {
    public static void main(String[] args) {
        List<String> stringList = ReadInput.readInput();
        selectDel(stringList);
    }

    public static void selectDel(List<String> stringList) {
        String[] temp = stringList.get(0).split(" ");
        String[] temp_1 = stringList.get(stringList.size() - 1).split(" ");

        List<String> original = new ArrayList<>(List.of(temp));
        List<String> errorDeleted = new ArrayList<>(List.of(temp_1));

        for (String s : errorDeleted) {
            for (int i = 0; i < original.size(); i++) {
                if (s.equals(original.get(i))) {
                    original.remove(i);
                    break;
                }
            }
        }

        for (String s : original) {
            System.out.println(s);
        }
    }
}
