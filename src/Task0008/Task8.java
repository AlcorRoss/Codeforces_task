package Task0008;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        String line = ReadInput.readInput();
        summandSort(line);
    }

    public static void summandSort(String line) {
        StringBuilder st = new StringBuilder();

        String[] temp = line.split("\\+");
        Arrays.sort(temp);

        for (int i = 0; i < temp.length; i++) {
            st.append(temp[i]);
            if (i == temp.length - 1) break;
            st.append("+");
        }

        System.out.println(st);
    }
}
