package Task0012;

public class Task12 {
    public static void main(String[] args) {
        String line = ReadInput.readInput();
        counter(line);
    }

    public static void counter(String line) {
        int counter = 0;
        int a = Integer.parseInt(line.substring(0, 1));
        int b = Integer.parseInt(line.substring(2));

        while (true) {
            counter++;
            a *= 3;
            b *= 2;
            if (a > b) {
                System.out.println(counter);
                break;
            }
        }
    }
}
