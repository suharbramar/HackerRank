import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaMatcherGroup1 {
    public static void main(String[] args)
    {

        // Get the regex to be checked
        String regex = "(T*e)";

        // Create a pattern from regex
        Pattern pattern
                = Pattern.compile(regex);

        // Get the String to be matched
        String stringToBeMatched
                = "TeeksForTeeks";

        // Create a matcher for the input String
        Matcher matcher = pattern.matcher(stringToBeMatched);

        // Get the current matcher state
        MatchResult result
                = matcher.toMatchResult();
        System.out.println("Current Matcher: "
                + result);

        while (matcher.find()) {
            // Get the group matched using group() method
            System.out.println("Start : "+matcher.start());
            System.out.println("End : "+matcher.end());

            System.out.println(matcher.group());
        }
    }
}
