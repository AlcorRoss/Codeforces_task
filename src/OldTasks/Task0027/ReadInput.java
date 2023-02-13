package OldTasks.Task0027;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadInput {
    public static List<Notebook> readInput() {
        File input = new File("D:\\Java\\Java_work\\Codeforces_task\\src\\OldTasks.Task0027\\Input.txt");
        List<Notebook> notebooks = new ArrayList<>();
        String line;

        try (BufferedReader bf = new BufferedReader(new FileReader(input))) {
            bf.readLine();
            while ((line = bf.readLine()) != null) {
                String[] temp = line.split(" ");
                notebooks.add(new Notebook(Integer.parseInt(temp[0]), Integer.parseInt(temp[1])));
            }
        } catch (IOException e) {
            System.out.println("Не удалось получить вводные данные");
            System.out.println(e.getMessage());
        }
        return notebooks;
    }
}
