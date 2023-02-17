
import java.util.Scanner;

public class Task0069_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxTestsCount = sc.nextInt();
        for (int i = 0; i < maxTestsCount; i++) {
            int maxMemberCount = sc.nextInt();
            int[] weights = new int[105];

            for (int j = 0; j < maxMemberCount; j++) {
                weights[sc.nextInt()]++;
            }

            int max = 0;

            for (int j = 1; j <= 104; j++) {
                int counter = 0;
                for (int k = 1; k <= j; k++) {
                    counter += Math.min(weights[k], weights[j - k]);
                }
                max = Math.max(counter, max);
            }
            System.out.println(max/2);
        }
    }
}
//j=5
//k=1 -> counter+= количество пар с весом 1 или весом 4 (что меньше)
//k=2 -> counter+= количество пар с весом 2 или весом 3 (что меньше)
//k=3 -> counter+= количество пар с весом 3 или весом 2 (что меньше)
//k=4 -> counter+= количество пар с весом 1 или весом 4 (что меньше)
//k=5 -> counter+= количество пар с весом 0 или весом 5 (что меньше) -> с весом 0 всегда 0, поэтому вернется 0.
// for (int k = 1; k < j; k++) здесь вот так-1 итерация по k для каждого j
