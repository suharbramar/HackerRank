import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class DivisibleSumPairsResult {

    /*
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        // Sample input

        /*
        STDIN           Function
        -----           --------
                6 3             n = 6, k = 3
        1 3 2 6 1 2     ar = [1, 3, 2, 6, 1, 2]
         */

        int tmp;
        int count = 0;
        for(int i = 0; i < ar.size(); i++){
            for(int j = 1; j < ar.size(); j++){
                tmp = 0;
                if(i < j){
                    tmp = ar.get(i) + ar.get(j);
                    if(tmp % k == 0){
                        count++;
                    }
                }
            }
        }

        return count;

    }

}

public class DivisibleSumPairs {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = DivisibleSumPairsResult.divisibleSumPairs(n, k, ar);

        System.out.println("result : "+result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
