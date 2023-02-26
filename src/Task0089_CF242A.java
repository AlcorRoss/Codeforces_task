import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task0089_CF242A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int quantityV = in.nextInt();
        int quantityP = in.nextInt();
        int minV = in.nextInt();
        int minP = in.nextInt();
        int counter = 0;
        List<Integer> variantV = new ArrayList<>();
        List<Integer> variantP = new ArrayList<>();

        if (quantityV * minV <= quantityP * minP) {
            System.out.println(0);
            return;
        }

        for (int i = Math.max(minP + 1, minV); i <= quantityV; i++) {
            for (int j = minP; j < Math.min(i, quantityP + 1); j++) {
                variantV.add(i);
                variantP.add(j);
                counter++;
            }
        }

        System.out.println(counter);
        for (int i = 0; i < variantV.size(); i++) {
            System.out.println(variantV.get(i) + " " + variantP.get(i));
        }
    }
}