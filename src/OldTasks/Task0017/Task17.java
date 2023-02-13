package OldTasks.Task0017;

public class Task17 {
    public static void main(String[] args) {
        String line = ReadInput.readInput();
        calculate(line);
    }

    public static void calculate(String line) {
        int counter = 0;

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '4' || line.charAt(i) == '7') counter++;
        }

        switch (counter) {
            case 4, 7 -> System.out.println("YES");
            default -> System.out.println("NO");
        }
    }
}
