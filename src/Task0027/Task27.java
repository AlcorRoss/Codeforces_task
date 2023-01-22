package Task0027;

import java.util.List;
import static Task0027.Notebook.notebookCompare;

public class Task27 {
    public static void main(String[] args) {
        List<Notebook> notebookList = ReadInput.readInput();
        System.out.println(notebookCompare(notebookList));
    }
}
