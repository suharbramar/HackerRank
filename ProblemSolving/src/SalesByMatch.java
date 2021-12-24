import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class SalesByMatchResult {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        Set<Integer> colors = new HashSet<>();
        int pairs = 0;

        /*
         7
         1 2 1 2 1 3 2

         ar.get(0) = 1
         colors.add(ar.get(0)) -> 1

         1
         ar.get(1) = 2
         colors.add(ar.get(1)) -> 2
         1 2

         ar.get(2) = 1 -> true
         pairs ++ = 1
         colors.remove(ar.get(2));
         2

         ar.get(3) = 2 -> true
         pairs ++ = 2
         colors.remove(ar.get(3));

         ar.get(4) = 1 -> true
         pairs ++ = 3
         */
        for (int i = 0; i < n; i++) {
            if (!colors.contains(ar.get(i))) {
                colors.add(ar.get(i));
            } else {
                pairs++;
                colors.remove(ar.get(i));
            }
        }

        return pairs;

    }

}

public class SalesByMatch{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = SalesByMatchResult.sockMerchant(n, ar);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
   //     bufferedWriter.close();
    }
}
