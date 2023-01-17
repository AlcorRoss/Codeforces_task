package Task4;

public class Task4 {
    public static void main(String[] args) {
        String line = ReadInput.readInput();
        System.out.println(counter(line));
    }

    public static int counter(String line) {
        int width, length;
        String[] temp = line.split(" ");
        width = Integer.parseInt(temp[0]);
        length = Integer.parseInt(temp[1]);
        if (width < 2 && length < 2) return 0;
        return (width * length) / 2;
    }
}