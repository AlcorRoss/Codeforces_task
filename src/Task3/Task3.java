package Task3;

import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> list = ReadInput.readInput();
        System.out.println(counter(list));
    }

    public static int counter(List<String> list) {
        int result = 0, targetParticipant, passingScore;

        String[] temp1 = list.get(0).split(" ");
        targetParticipant = Integer.parseInt(temp1[1]);

        String[] temp2 = list.get(1).split(" ");
        passingScore = Integer.parseInt(temp2[targetParticipant - 1]);

        if (passingScore < 1) return 0;

        for (String s : temp2) {
            if (Integer.parseInt(s) >= passingScore) result++;
        }

        return result;
    }
}