import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class RepeatedStringResult {

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
    // Write your code here
     //aba
     //10
     //m = 10 / 3 = 3
    long count = 0; //2
      for(int i=0; i < s.length();i++){
          if(s.charAt(i) == 'a'){
              count++;
          }
      } 
    
    long m = (long)n / (long)s.length();
    count = count * m;//6
    n = n % (long)s.length(); //3

    for(int i=0; i < n;i++){
        if(s.charAt(i) == 'a'){
            count++;
        }
    }


     return count;

    }

   

}

public class RepeatedString {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = RepeatedStringResult.repeatedString(s, n);

      //  bufferedWriter.write(String.valueOf(result));
      //  bufferedWriter.newLine();

        bufferedReader.close();
       // bufferedWriter.close();
    }
}
