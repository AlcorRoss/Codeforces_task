package Task0018;

public class Task18 {
    public static void main(String[] args) {
        String line = ReadInput.readInput();
        calculate(line);
    }

    public static void calculate(String line) {
        int counter = 0;

        for (int i = 1; i < line.length(); i++) {
            if (line.charAt(i - 1) == line.charAt(i)) {
                counter++;
            } else {
                counter = 0;
            }

            if (counter == 7) {
                System.out.println("YES");
                break;
            }
        }

        if (counter < 7) System.out.println("NO");
    }
}
