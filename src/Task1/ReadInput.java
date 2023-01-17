package Task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadInput {
    public static List<String> readInput() {
        List<String> stringList = new ArrayList<>();

        try (BufferedReader bf = new BufferedReader(new FileReader("input.txt"))) {
            int count = Integer.getInteger(bf.readLine());
            for (int i = 0; i < count; i++) {
                stringList.add(bf.readLine());
            }
        } catch (IOException e) {
            System.out.println("Не удалось получить вводные данные");
            System.out.println(e.getMessage());
        }

        return stringList;
    }
}
