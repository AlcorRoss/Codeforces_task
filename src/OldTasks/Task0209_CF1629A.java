package OldTasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task0209_CF1629A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int numberOfTest = in.nextInt();

        while (numberOfTest-- > 0) {
            int numberOfValues = in.nextInt();
            int result = in.nextInt();
            int[] temp = new int[numberOfValues];
            int[] temp1 = new int[numberOfValues];
            List<Program> values = new ArrayList<>();

            for (int i = 0; i < numberOfValues; i++) temp[i] = in.nextInt();
            for (int i = 0; i < numberOfValues; i++) temp1[i] = in.nextInt();
            for (int i = 0; i < numberOfValues; i++) values.add(new Program(temp[i], temp1[i]));
            Collections.sort(values);
            for (Program value : values) {
                if (value.cost <= result) result += value.growth;
                else break;
            }
            System.out.println(result);
        }
    }

    public static class Program implements Comparable<Program> {
        private final int cost;
        private final int growth;

        public Program(int cost, int growth) {
            this.cost = cost;
            this.growth = growth;
        }

        @Override
        public int compareTo(Program o) {
            return Integer.compare(this.cost, o.cost);
        }
    }
}
