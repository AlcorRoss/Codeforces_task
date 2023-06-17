package OldTasks;

import java.util.Scanner;

public class Task0205_CF1709A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int numberOfTest = in.nextInt();

        while (numberOfTest-- > 0) {
            boolean flag = true;
            int key = in.nextInt() - 1;
            int[] doors = new int[3];
            for (int i = 0; i < 3; i++) doors[i] = in.nextInt();
            for (int i = 0; i < 2; i++) {
                key = checkDoor(key, doors);
                if (key == -1) {
                    System.out.println("NO");
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.println("YES");
        }
    }

    private static int checkDoor(int key, int[] doors) {
        if (doors[key] == 0) return -1;
        else return doors[key] - 1;
    }
}
