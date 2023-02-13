package OldTasks;

import java.util.*;

public class Task0047_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            int numberOfValues = in.nextInt();
            Integer[] values = new Integer[numberOfValues];
            List<Integer> sequence = new ArrayList<>();
            int tempPositive = 0, tempNegative = Integer.MIN_VALUE;
            boolean flagPositive = true;
            boolean flagNegative = true;

            for (int j = 0; j < numberOfValues; j++) {
                values[j] = in.nextInt();
                if (values[j] > 0) flagPositive = false;
                if (values[j] < 0) flagNegative = false;
            }

            if (flagPositive && !flagNegative || !flagPositive && flagNegative) {
                System.out.println(Collections.max(Arrays.asList(values)));
            } else {
                if (values[0] > 0) {
                    // Finding the largest sequence from the first positive value.
                    for (int j = 0; j < values.length; j++) {
                        if (values[j] > 0 && sequence.size() % 2 == 0) {
                            tempPositive = Math.max(tempPositive, values[j]);
                            if (j == values.length - 1) {
                                sequence.add(tempPositive);
                                break;
                            }
                        } else if (values[j] < 0 && sequence.size() % 2 == 0) {
                            sequence.add(tempPositive);
                            tempPositive = 0;
                            tempNegative = values[j];
                        }

                        if (values[j] < 0 && sequence.size() % 2 != 0) {
                            tempNegative = Math.max(tempNegative, values[j]);
                            if (j == values.length - 1) {
                                sequence.add(tempNegative);
                                break;
                            }
                        } else if (values[j] > 0 && sequence.size() % 2 != 0) {
                            sequence.add(tempNegative);
                            tempNegative = Integer.MIN_VALUE;
                            tempPositive = values[j];
                        }
                    }
                } else {
                    // Finding the largest sequence from the first negative value.
                    for (int j = 0; j < values.length; j++) {
                        if (values[j] < 0 && sequence.size() % 2 == 0) {
                            tempNegative = Math.max(tempNegative, values[j]);
                            if (j == values.length - 1) {
                                sequence.add(tempNegative);
                                break;
                            }
                        } else if (values[j] > 0 && sequence.size() % 2 == 0) {
                            sequence.add(tempNegative);
                            tempNegative = Integer.MIN_VALUE;
                            tempPositive = values[j];
                        }

                        if (values[j] > 0 && sequence.size() % 2 != 0) {
                            tempPositive = Math.max(tempPositive, values[j]);
                            if (j == values.length - 1) {
                                sequence.add(tempPositive);
                                break;
                            }
                        } else if (values[j] < 0 && sequence.size() % 2 != 0) {
                            sequence.add(tempPositive);
                            tempPositive = 0;
                            tempNegative = values[j];
                        }
                    }
                }
                if (sequence.get(sequence.size() - 1) < 0 && tempPositive != 0) {
                    sequence.add(tempPositive);
                } else if (sequence.get(sequence.size() - 1) > 0
                        && tempNegative != Integer.MIN_VALUE) {
                    sequence.add(tempNegative);
                }

                System.out.println(sequenceSum(sequence));
            }
        }
    }

    public static long sequenceSum(List<Integer> values) {
        long result = 0;
        for (int value : values) {
            result += value;
        }
        return result;
    }
}