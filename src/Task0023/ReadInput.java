package Task0023;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadInput {
    public static String readInput() {
        File input = new File("D:\\Java\\Java_work\\Codeforces_task\\src\\Task0023\\Input.txt");
        String line = null;

        try (BufferedReader bf = new BufferedReader(new FileReader(input))) {
            bf.readLine();
            line = bf.readLine();
        } catch (IOException e) {
            System.out.println("Не удалось получить вводные данные");
            System.out.println(e.getMessage());
        }
        return line;
    }
}
