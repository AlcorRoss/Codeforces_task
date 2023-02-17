
import java.util.Scanner;

public class Task0069_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxTestsCount = sc.nextInt();
        for (int i = 0; i < maxTestsCount; i++) {
            int maxMemberCount = sc.nextInt();
            int[] weights = new int[105]; //да,беру допущение,что максимальный вес человека у нас - это 105 кг, идеальная вселенная))

            for (int j = 0; j < maxMemberCount; j++) {
                weights[sc.nextInt()]++;
            }

            int max = 0;
            //иду по числу количества весов всех участников,
            // т.е. для последовательности: 1 1 3 4 4 2 мой массив будет иметь вид 0 2 1 1 2
            for (int j = 1; j <= 104; j++) {
                int counter = 0;
                //принимаю каждый вес как максимальный и пытаюсь сосчитать число пар с ним
                //имеет смысл считать только те веса,что остались слева,т.е. для 3,например - это будет вес 1 и 2
                //каждый раз считаю,что полученное число пар - максимальное и иду дальше к следующему весу
                //имеет смысл проходиться в k цикле только до половины индексов j,т.к. дальше сочетания начнут повторяться
                //причем тут важно именно сочетание k и j-k, т.е. подибра
                for (int k = 1; k <= j; k++) {
                    counter += Math.min(weights[k], weights[j - k]);
                }
                max = Math.max(counter, max);
            }
            System.out.println(max/2);
        }
    }
}
