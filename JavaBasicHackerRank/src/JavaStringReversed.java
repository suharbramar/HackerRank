import java.io.*;
import java.util.*;

public class JavaStringReversed{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A = sc.next();
        //ex : m a d a m
        //     0 1 2 3 4

        //ex ; s d f s d f s d f f
        //

        int length = A.length();
        Boolean palindrom = false;
        if(length == 0 || length == 1){
            palindrom = true;
        }else {
          //  length = (length % 2 == 0 ) ? length - 2  : length / 2;
            for (int i = 0; i < length / 2 ; i++) {
                String left = A.substring(i, i + 1);
                String right = A.substring(length - (i + 1), length - i);
                if (left.equalsIgnoreCase(right)) {
                    palindrom = true;
                }else {
                    palindrom = false;
                }
            }
        }
        System.out.println((palindrom) ? "Yes" : "No");

        /* Enter your code here. Print output to STDOUT. */

    }
}



