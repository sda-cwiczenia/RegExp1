import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(\\d{2})\\s+(\\d{9})");


        Matcher matcher = pattern.matcher("23 456789230");

        if (matcher.matches()) {
            System.out.println("Prefiks: " + matcher.group(1));
            System.out.println("Numer: " + matcher.group(2));
        } else {
            System.out.println("Brak dopasowania!!!");
        }

    }
}
