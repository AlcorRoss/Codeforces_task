import java.util.Scanner;

public class Task0077_CF1369B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            int lineLength = in.nextInt();
            String line = in.next();



        }
    }

    public static void removeZero(String line) {
        for (int i = line.length() - 1; i > 0; i--) {

        }
    }
}

// 11001101 →
// 1100101 →
// 110101 →
// 10101 →
// 1101 →
// 101 →
// 01.

// 11001101 →  если i!=0, то удаляем 1 с конца после первого 0
// 11001101 →
// 1100101 →
// 110001 →
// 10001 →

// 10001 → с начала. удаляем 0 после первой единицы, если следующий 0 и i!=длине строки
// 1001 →
// 101 →

// 101 → идем с конца, удаляем единицы после 0
// 01 →

//выводим результат