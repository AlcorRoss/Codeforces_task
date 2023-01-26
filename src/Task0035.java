import java.util.*;

public class Task0035 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int counter = 0;
        Map<Integer, Integer> valuesMap = new HashMap<>();
        String line;
        int m;

        System.out.println("Введите массив");
        line = in.nextLine();
        String[] temp = line.split(" ");
        for (String s : temp) {
            valuesMap.merge(Integer.parseInt(s), 1, Integer::sum);
        }

        System.out.println("Введите m");
        m = in.nextInt();

        for (int i : valuesMap.keySet()) {
            if (valuesMap.get(i) != 0 && valuesMap.containsKey(m - i) && valuesMap.get(m - i) != 0) {
                counter += Math.min(valuesMap.get(i), valuesMap.get(m - i));
                valuesMap.put(m - i, 0);
            }
            valuesMap.put(i, 0);
        }

        System.out.println(counter);
    }
}