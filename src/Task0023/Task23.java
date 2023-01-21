package Task0023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task23 {
    public static void main(String[] args) {
        String line = ReadInput.readInput();
        calculate(line);
    }

    public static void calculate(String line) {
        List<Integer> groups = new ArrayList<>();
        String[] temp = line.split(" ");
        int result = 0, buffer = 0;

        for (String s : temp) {
            groups.add(Integer.parseInt(s));
        }

        groups.sort(Collections.reverseOrder());

        for (int i = 0; i < groups.size(); i++) {
            if (groups.get(i) == 4) {
                result++;
            } else if (groups.get(i) == 0) {
                break;
            } else if (groups.get(i) != 0 && i == groups.size() - 1) {
                result++;
            } else {
                for (int j = groups.size() - 1; j > i; j--) {
                    if (groups.get(j) + groups.get(i) > 4) {
                        result++;
                        break;
                    } else if (groups.get(j) + groups.get(i) + buffer == 4) {
                        groups.set(j, 0);
                        buffer = 0;
                        result++;
                        break;
                    } else if (groups.get(j) + groups.get(i) + buffer < 4 && j != i + 1
                            && groups.get(j) + groups.get(j - 1) + groups.get(i) + buffer <= 4) {
                        buffer += groups.get(j);
                        groups.set(j, 0);
                    } else if (groups.get(j) + groups.get(i) + buffer < 4 && j != i + 1
                            && groups.get(j) + groups.get(j - 1) + groups.get(i) + buffer > 4) {
                        result++;
                        buffer = 0;
                        groups.set(j, 0);
                        break;
                    } else if (groups.get(j) + groups.get(i) + buffer < 4 && j == i + 1) {
                        result++;
                        buffer = 0;
                        groups.set(j, 0);
                        break;
                    }
                }
            }
        }

        System.out.println(result);
    }
}
