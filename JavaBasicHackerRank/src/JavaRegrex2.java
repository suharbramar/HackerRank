import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegrex2 {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(?:\\W+\\1\\b)";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                String mGroup = m.group();
                System.out.println("mgroup : "+mGroup);

                String mGroup1 = m.group(1);
                System.out.println("mGroup_1 :"+mGroup1);
                input = input.replaceAll(m.group(), m.group(1));

                System.out.println("input : "+input);
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}