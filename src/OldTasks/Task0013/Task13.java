package OldTasks.Task0013;

public class Task13 {
    public static void main(String[] args) {
        String line = ReadInput.readInput();
        counter(line);
    }

    public static void counter(String line) {
        String[] temp = line.split(" ");
        int price = Integer.parseInt(temp[0]);
        int balance = Integer.parseInt(temp[1]);
        int quantity = Integer.parseInt(temp[2]);
        int total = 0;

        for (int i = 1; i <= quantity; i++) {
            total += i * price;
        }

        System.out.println(total - balance);
    }
}
