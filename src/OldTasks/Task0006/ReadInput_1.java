package OldTasks.Task0006;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadInput_1 {
    public static List<Integer> readInput() {
        File input = new File("D:\\Java\\Java_work\\Codeforces_task\\src\\OldTasks.Task0006\\Input.txt");
        List<Integer> integerList = new ArrayList<>();
        String line;
        int temp;

        try (BufferedReader bf = new BufferedReader(new FileReader(input))) {
            while ((temp = bf.read()) != -1) {
                line = String.valueOf(Character.toChars(temp));
                if (line.equals("1") || line.equals("0")) {
                    temp = Integer.parseInt(line);
                    integerList.add(temp);
                }
            }
        } catch (IOException e) {
            System.out.println("Не удалось получить вводные данные");
            System.out.println(e.getMessage());
        }

        return integerList;
    }
}
