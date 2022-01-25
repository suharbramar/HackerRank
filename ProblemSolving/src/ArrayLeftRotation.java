import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class ArrayLeftRotationResult {

    /*
     * Complete the 'rotLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER d
     */

    public static List<Integer> rotLeft(List<Integer> a, int d) {
     //use java 8 
     //Collections.rotate(a, d * -1);
     //[1,2,3,4,5] -> [2,3,4,5,1] -> [3,4,5,1,2] -> [4,5,1,2,3] -> [5,1,2,3,4]
     //use DS
     for(int i =0; i < d; i++){
         int tmp = a.get(0);
         a.remove(0);
         a.add(tmp);

     }

      return a;
    }

}

public class ArrayLeftRotation {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        List<Integer> result = ArrayLeftRotationResult.rotLeft(a, d);

        for (int i = 0; i < result.size(); i++) {
           // bufferedWriter.write(String.valueOf(result.get(i)));
             System.out.print(result.get(i));
            if (i != result.size() - 1) {
                System.out.print("");
          //      bufferedWriter.write(" ");
            }
        }
        System.out.println();

      //  bufferedWriter.newLine();

       // bufferedReader.close();
        //bufferedWriter.close();
    }
}
