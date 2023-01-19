package Task0014;

public class Task14 {
    public static void main(String[] args) {
        String line = ReadInput.readInput();
        counter(line);
    }

    public static void counter(String line) {
        int distance = Integer.parseInt(line);
        if (distance <= 5) {
            System.out.println(1);
        } else {
            System.out.println(distance / 5 + 1);
        }
    }
}
