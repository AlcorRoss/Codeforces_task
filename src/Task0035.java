import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task0035 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> integerList = new LinkedList<>();
        int purpose, counter = 0;
        String line;
        int m;

        System.out.println("Введите массив");
        line = in.nextLine();
        String[] temp = line.split(" ");
        for (String s : temp) {
            integerList.add(Integer.parseInt(s));
        }

        System.out.println("Введите m");
        m = in.nextInt();

        while (integerList.size() >= 2) {
            purpose = m - integerList.get(0);
            integerList.remove(0);
            if (integerList.contains(purpose)) {
                counter++;
                for (int i = 0; i < integerList.size(); i++) {
                    if (integerList.get(i) == purpose) {
                        integerList.remove(i);
                        break;
                    }
                }
            }
        }

        System.out.println(counter);
    }
}