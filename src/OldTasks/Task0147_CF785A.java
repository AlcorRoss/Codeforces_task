package OldTasks;

import java.util.Scanner;

public class Task0147_CF785A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfValues = in.nextInt();
        String temp;
        int result = 0;

        while (numberOfValues-- > 0) {
            temp = in.next();
            switch (temp) {
                case ("Tetrahedron") -> result += 4;
                case ("Cube") -> result += 6;
                case ("Octahedron") -> result += 8;
                case ("Dodecahedron") -> result += 12;
                case ("Icosahedron") -> result += 20;
            }
        }
        System.out.println(result);
    }
}
