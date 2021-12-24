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


class Result {

    /*
     * Complete the 'viralAdvertising' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int viralAdvertising(int n) {
        // Write your code here
        int shared = 0;
        int cumulative = 0;

        shared = 5;
        for(int day = 1; day <= n;day++){
            cumulative = cumulative + Math.floorDiv(shared, 2);
            shared = Math.floorDiv(shared , 2) * 3;
        }

        return cumulative;
    }

}

public class ViralAdvertising {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.viralAdvertising(n);

      //  bufferedWriter.write(String.valueOf(result));
      //  bufferedWriter.newLine();
        System.out.println(result);

        bufferedReader.close();
      //  bufferedWriter.close();
    }
}
