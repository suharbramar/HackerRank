import java.io.*;
import java.util.*;

public class JavaStringIntroduction{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */

        int stringLength = A.length() + B.length();
        String islexicographically = A.compareTo(B) > 0 ? "Yes" : "No";
        String capitalize = A.substring(0, 1).toUpperCase() + A.substring(1).
                concat(" "+B.substring(0, 1).toUpperCase() + B.substring(1));

        System.out.println(stringLength);
        System.out.println(islexicographically);
        System.out.println(capitalize);


    }
}