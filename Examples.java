import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Examples {

    private static Pattern p;
    private static Matcher m;

    public boolean validateEmail(String input) {
        p = Pattern.compile("[a-z A-Z 0-9 \\.\\-\\_]*[a-z A-Z 0-9 \\.\\-\\_]" + "\\@"
                + "[a-z A-Z 0-9]*[a-z A-Z 0-9]\\." + "([a-z A-Z][a-z A-Z]\\.[a-z A-Z][a-z A-Z]"
                + "|[a-z A-Z][a-z A-Z][a-z A-Z]" + "|[a-z A-Z][a-z A-Z]"
                + "|[a-z A-Z][a-z A-Z][a-z A-Z][a-z A-Z][a-z A-Z][a-z A-Z]"
                + "|[a-z A-Z][a-z A-Z][a-z A-Z][a-z A-Z]"
                + "|[a-z A-Z][a-z A-Z][a-z A-Z][a-z A-Z] + "
                + "|[a-z A-Z][a-z A-Z][a-z A-Z]\\.[a-z A-Z][a-z A-Z])");
        m = p.matcher(input);
        System.out.println(m.matches());
        return m.matches();
    }
}
