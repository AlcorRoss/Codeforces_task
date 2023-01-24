package Task0027;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Task27_1 {
    public static void main(String[] args) {
        List<Notebook> notebookList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            notebookList.add(new Notebook(in.nextInt(), in.nextInt()));
        }

        System.out.println(Notebook.notebookCompare(notebookList));
    }

    record Notebook(int price, int quality) implements Comparable<Notebook> {

        @Override
        public int compareTo(Notebook o) {
            return Integer.compare(this.price(), o.price());
        }

        public static String notebookCompare(List<Notebook> notebookList) {
            Collections.sort(notebookList);
            for (int i = 0; i < notebookList.size() - 1; i++) {
                if (notebookList.get(i).quality() > notebookList.get(i + 1).quality()
                        && notebookList.get(i).price < notebookList.get(i + 1).price) {
                    return "Happy Alex";
                }
            }
            return "Poor Alex";
        }
    }
}
