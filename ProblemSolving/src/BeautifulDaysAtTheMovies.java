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

class ResultBeautifulDaysAtTheMovies {

    /*
     * Complete the 'beautifulDays' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER i
     *  2. INTEGER j
     *  3. INTEGER k
     */

    public static int beautifulDays(int i, int j, int k) {
        // Write your code here
        //sample input
        /*
        20 -> start day
        23 -> end day
        6 -> the advisor
         */

        int countBeautifulDays = 0;
        for(int startDay = i; startDay <= j; startDay++){
            if((startDay - Math.abs(getReverseString(startDay))) % k == 0){
              countBeautifulDays++;
            }
        }

        return countBeautifulDays;

    }

    public static int getReverseString(int a){
        String strA = String.valueOf(a);
        char ch[] = strA.toCharArray();

        String reversed = "";
        for(int i = ch.length - 1; i >=0; i-- ){
           reversed += ch[i];
        }

        //System.out.println(Integer.parseInt(reversed));
        return Integer.parseInt(reversed);
    }

}
public class BeautifulDaysAtTheMovies {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");


        int i = Integer.parseInt(firstMultipleInput[0]);

        int j = Integer.parseInt(firstMultipleInput[1]);

        int k = Integer.parseInt(firstMultipleInput[2]);

        int result = ResultBeautifulDaysAtTheMovies.beautifulDays(i, j, k);

        System.out.println("result: "+result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }

}
