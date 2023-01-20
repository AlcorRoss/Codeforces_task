package Task0015;

public class Task15 {
    public static void main(String[] args) {
        String line = ReadInput.readInput();
        registerFormatter(line);
    }

    public static void registerFormatter(String line) {
        int upCounter = 0, lowCounter = 0;

        for (int i = 0; i < line.length(); i++) {
            if (Character.isUpperCase(line.charAt(i))) {
                upCounter++;
            } else {
                lowCounter++;
            }
        }

        if (upCounter <= lowCounter) {
            System.out.println(line.toLowerCase());
        } else {
            System.out.println(line.toUpperCase());
        }
    }
}
