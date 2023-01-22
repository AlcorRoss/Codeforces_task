package Task0027;

import java.util.Collections;
import java.util.List;

public record Notebook(int price, int quality) implements Comparable<Notebook> {

    @Override
    public int compareTo(Notebook o) {
        return Integer.compare(this.price(), o.price());
    }

    public static String notebookCompare(List<Notebook> notebookList) {
        Collections.sort(notebookList);
        for (int i = 0; i < notebookList.size() - 1; i++) {
            if (notebookList.get(i).quality() > notebookList.get(i + 1).quality()) {
                return "Happy Alex";
            }
        }
        return "Poor Alex";
    }
}
