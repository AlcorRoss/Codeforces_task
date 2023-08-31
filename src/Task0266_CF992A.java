import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task0266_CF992A {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.println(IntStream.range(0, in.nextInt())
                .map(val -> in.nextInt()).filter(val -> val != 0).boxed().collect(Collectors.toSet()).size());
    }
}
