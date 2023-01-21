package Task0024;

import java.util.ArrayList;
import java.util.List;

public class Task24 {
    public static void main(String[] args) {
        List<String> stringList = ReadInput.readInput();
        calculate(stringList);
    }

    public static void calculate(List<String> stringList) {
        List<Integer> price = new ArrayList<>();
        List<Integer> balance = new ArrayList<>();
        int counter = 0;

        String[] temp = stringList.get(1).split(" ");

        for (String s : temp) {
            price.add(Integer.parseInt(s));
        }

        for (int i = 3; i < stringList.size(); i++) {
            balance.add(Integer.parseInt(stringList.get(i)));
        }

        for (int i : balance) {
            for (int j : price) {
                if (i >= j) counter++;
            }
            System.out.println(counter);
            counter = 0;
        }
    }
}
