import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaEndOfFile {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        String result = "";
        int line = 0;
        while(sc.hasNext()){
          line++;
         // result = result.concat(line +" "+sc.nextLine()+"\n");
         // System.out.print(result);
            System.out.print(line +" "+sc.nextLine()+"\n");
        }
    }
}
