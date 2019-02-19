import java.util.regex.Pattern;

public class ReqExpMain {
    public static void main(String[] args) {
        String name = "Alicja";
        String template = "^A.*[am]$";
        boolean isMatched = Pattern.matches(template, name);
        System.out.println(isMatched);
    }
}
