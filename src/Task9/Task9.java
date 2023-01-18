package Task9;

public class Task9 {
    public static void main(String[] args) {
        String line = ReadInput.readInput();
        capitalization(line);
    }

    public static void capitalization(String line) {
        System.out.println(line.substring(0, 1).toUpperCase() + line.substring(1));
    }
}
