package Task0022;

public class Task22 {
    public static void main(String[] args) {
        String line = ReadInput.readInput();
        calculate(line);
    }

    public static void calculate(String line) {
        String aim = "hello";
        int aimCounter = 0;

        for (int i = 0; i < line.length(); i++) {
            if (aimCounter == 5) break;
            if (line.charAt(i) == aim.charAt(aimCounter)) aimCounter++;
        }

        if (aimCounter == 5) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
