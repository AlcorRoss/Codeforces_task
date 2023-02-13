package OldTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task0057 {
    public static void main(String[] args) {
        Random r = new Random();
        String example = "dfhdlfhdl323 sdd 22323 sdddewfe sokolovdenic@yandex.ru dfdfdfdfk dfd?fd,dfdf, " +
                "m ddfdm sokolovdenic1@mail.ru";
        Pattern pattern = Pattern.compile("(\\d|\\w)+@(yandex|mail)\\.ru");
        Matcher matcher = pattern.matcher(example);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        Integer[] test = new Integer[10];
        Arrays.fill(test, 1);
        List<Integer> testList = new ArrayList<>(List.of(test));

        testList = testList.stream().map(a -> a * r.nextInt(1, 111)).toList();
        System.out.println(testList);

        testList = testList.stream().filter(a -> a % 2 == 0).toList();
        System.out.println(testList);

    }
}
