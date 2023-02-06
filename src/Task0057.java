import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task0057 {
    public static void main(String[] args) {
        String example = "dfhdlfhdl323 sdd 22323 sdddewfe sokolovdenic@yandex.ru dfdfdfdfk dfd?fd,dfdf, " +
                "m ddfdm sokolovdenic1@mail.ru";
        Pattern pattern = Pattern.compile("(\\d|\\w)+@(yandex|mail)\\.ru");
        Matcher matcher = pattern.matcher(example);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
