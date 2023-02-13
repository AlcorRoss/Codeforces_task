package OldTasks.Task0020;

public class Task20 {
    public static void main(String[] args) {
        String line = ReadInput.readInput();
        calculate(line);
    }

    public static void calculate(String line) {
        StringBuilder st = new StringBuilder();
        line = line.toLowerCase();
        char[] chars = line.toCharArray();

        for (char c : chars) {
            if (c != 'a' && c != 'o' && c != 'y' && c != 'e' && c != 'u' && c != 'i') st.append(".").append(c);
        }

        System.out.println(st);
    }
}
