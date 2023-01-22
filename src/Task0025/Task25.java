package Task0025;

import java.util.List;

public class Task25 {
    public static void main(String[] args) {
        List<String> stringList = ReadInput.readInput();
        calculate(stringList);
    }

    public static void calculate(List<String> stringList) {
        int sum_1 = 0, sum_2 = 0, indexOrigin = 1;
        int quantity = Integer.parseInt(stringList.get(0).substring(2));

        String[] temp = stringList.get(1).split(" ");
        int[] boards = new int[temp.length];
        for (int i = 0; i < boards.length; i++) {
            boards[i] = Integer.parseInt(temp[i]);
        }

        for (int i = 0; i < quantity; i++) {
            sum_1 += boards[i];
        }

        for (int i = 0; i < boards.length - quantity; i++) {
            for (int j = i + 1; j <= i + quantity; j++) {
                sum_2 += boards[j];
            }

            if (sum_1 > sum_2) {
                indexOrigin = i + 2;
                sum_1 = sum_2;
            }
            sum_2 = 0;
        }

        System.out.println(indexOrigin);
    }
}
