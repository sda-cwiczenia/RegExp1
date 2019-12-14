import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("<(.+?)>");
        Matcher matcher = pattern.matcher("Koledzy <Adam> i <Tomek>");

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        System.out.println(matcher.replaceAll("<Piotr>"));
        System.out.println(matcher.replaceFirst("<Piotr>"));
    }
}
