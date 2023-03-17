package OldTasks;

import java.util.*;

public class Task0111_CF522A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfStrings = Integer.parseInt(in.nextLine());
        Map<String, Integer> uniqueRepost = new HashMap<>();
        uniqueRepost.put("polycarp", 1);

        while (numberOfStrings-- > 0) {
            String[] temp = in.nextLine().toLowerCase().split(" ");
            uniqueRepost.put(temp[0], uniqueRepost.get(temp[2]) + 1);
        }
        System.out.println(Collections.max(uniqueRepost.values()));
    }
}

