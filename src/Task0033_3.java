import java.util.Scanner;

public class Task0033_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfStudents, temp, maxOfIdenticalSkills = 0, lengthCorrector = 0;
        int numberOfTests = in.nextInt();
        int[] results = new int[numberOfTests];

        for (int i = 0; i < numberOfTests; i++) {
            numberOfStudents = in.nextInt();
            int[] tempArray = new int[numberOfStudents + 1];

            for (int j = 0; j < numberOfStudents; j++) {
                temp = in.nextInt();
                tempArray[temp]++;
            }

            for (int skill : tempArray) {
                if (skill > maxOfIdenticalSkills) maxOfIdenticalSkills = skill;
                if (skill == 0) lengthCorrector++;
            }

            if (maxOfIdenticalSkills - 1 >= tempArray.length - lengthCorrector) {
                results[i] = tempArray.length - lengthCorrector;
            } else if (maxOfIdenticalSkills <= tempArray.length - lengthCorrector - 1) {
                results[i] = maxOfIdenticalSkills;
            } else {
                results[i] = maxOfIdenticalSkills - 1;
            }

            maxOfIdenticalSkills = 0;
            lengthCorrector = 0;
        }

        for (int result : results) {
            System.out.println(result);
        }
    }
}
