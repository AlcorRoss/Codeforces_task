package Task0021;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadInput {
    public static List<String> readInput() {
        File input = new File("D:\\Java\\Java_work\\Codeforces_task\\src\\Task0021\\Input.txt");
        List<String> stringList = new ArrayList<>();
        int counter;

        try (BufferedReader bf = new BufferedReader(new FileReader(input))) {
            counter = Integer.parseInt(bf.readLine());
            for (int i = 0; i < counter; i++) {
                stringList.add(bf.readLine());
            }
        } catch (IOException e) {
            System.out.println("Не удалось получить вводные данные");
            System.out.println(e.getMessage());
        }
        return stringList;
    }
}
