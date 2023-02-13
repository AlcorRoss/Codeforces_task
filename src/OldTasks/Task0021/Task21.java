package OldTasks.Task0021;

import java.util.List;

public class Task21 {
    public static void main(String[] args) {
        List<String> stringList = ReadInput.readInput();
        calculate(stringList);
    }

    public static void calculate(List<String> stringList) {
        int coordinateX = 0, coordinateY = 0, coordinateZ = 0;

        for (String s : stringList) {
            String[] temp = s.split(" ");
            coordinateX += Integer.parseInt(temp[0]);
            coordinateY += Integer.parseInt(temp[1]);
            coordinateZ += Integer.parseInt(temp[2]);
        }

        if (coordinateX == 0 && coordinateY == 0 && coordinateZ == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
