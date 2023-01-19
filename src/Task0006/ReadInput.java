package Task0006;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadInput {
    public static List<String> readInput() {
        File input = new File("D:\\Java\\Java_work\\Codeforces_task\\src\\Task0006\\Input.txt");
        List<String> stringList = new ArrayList<>();
        String line;

        try (BufferedReader bf = new BufferedReader(new FileReader(input))) {
            while ((line = bf.readLine()) != null) {
                stringList.add(line);
            }
        } catch (IOException e) {
            System.out.println("Не удалось получить вводные данные");
            System.out.println(e.getMessage());
        }

        return stringList;
    }
}
