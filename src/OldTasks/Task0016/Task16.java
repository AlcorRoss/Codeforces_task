package OldTasks.Task0016;

public class Task16 {
    public static void main(String[] args) {
        String line = ReadInput.readInput();
        calculate(line);
    }

    public static void calculate(String line) {
        String[] temp = line.split(" ");
        int digit = Integer.parseInt(temp[0]);
        int stepCounter = Integer.parseInt(temp[1]);

        for (int i = 0; i < stepCounter; i++) {
            if (digit % 10 == 0) {
                digit /= 10;
            } else {
                digit -= 1;
            }
        }

        System.out.println(digit);
    }
}
