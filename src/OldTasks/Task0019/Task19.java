package OldTasks.Task0019;

public class Task19 {
    public static void main(String[] args) {
        String line = ReadInput.readInput();
        calculate(line);
    }

    public static void calculate(String line) {
        String[] temp = line.split(" ");
        int n = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);
        int a = Integer.parseInt(temp[2]);
        int length, width;

        if (n % a == 0) {
            length = n / a;
        } else {
            length = n / a + 1;
        }

        if (m % a == 0) {
            width = m / a;
        } else {
            width = m / a + 1;
        }

        System.out.println(length * width);
    }
}
