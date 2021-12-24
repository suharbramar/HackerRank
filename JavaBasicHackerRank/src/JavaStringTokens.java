import java.io.*;
import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();

        String replaceString = s.replaceAll("[^a-zA-Z0-9]"," ");

        StringTokenizer result = new StringTokenizer(replaceString, " ");
        System.out.println(result.countTokens());

        while(result.hasMoreTokens()){
            System.out.println(result.nextToken());
        }

    }
}
