package OldTasks.Task0010;

public class Task10 {
    public static void main(String[] args) {
        String line = ReadInput.readInput();
        switcher(line);
    }

    public static void switcher(String line) {
        int result, counter = 0;
        char[] chars = line.toCharArray();

        for (int i = 0; i < line.length() - 1; i++) {
            for (int j = i + 1; j < line.length(); j++) {
                if (chars[i] == chars[j]) chars[j] = '0';
            }
        }

        for (char c : chars) {
            if (c == '0') counter++;
        }

        result = (line.length() - counter) % 2;

        switch (result) {
            case 0 -> System.out.println("CHAT WITH HER!");
            case 1 -> System.out.println("IGNORE HIM!");
        }
    }
}
