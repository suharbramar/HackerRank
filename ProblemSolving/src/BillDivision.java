import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class BillDivisionResult{

    /*
     * Complete the 'bonAppetit' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY bill
     *  2. INTEGER k
     *  3. INTEGER b
     */

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here

        /*
        4 -> number of item order 1 -> item anna not eat
        3 10 2 9
        12 -> amount brian charge anna
         */
        Set<Integer> filterList = IntStream.range(0, bill.size())
                .filter(i -> i != k)
                .mapToObj(bill::get)
                .collect(Collectors.toSet());
        filterList.forEach(System.out::println);

        int result = b - (IntStream.range(0, bill.size())
                .filter(i -> i != k)
                .mapToObj(bill::get)
                .reduce(0, Integer::sum) / 2) ;
        System.out.println(result == 0 ? "Bon Appetit" : result);

    }

}

public class BillDivision{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> bill = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int b = Integer.parseInt(bufferedReader.readLine().trim());

        BillDivisionResult.bonAppetit(bill, k, b);

        bufferedReader.close();
    }
}
