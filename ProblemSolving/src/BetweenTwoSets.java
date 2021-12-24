import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class BetweenTwoSetsResult {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        System.out.println("getTotalX () : ");

        if(a.size() == 0){
            return 0;
        }

        int f = lcm(a);
        int l = gcd(b);

        int count = 0;
        for(int j = f; j <= l; j++){
            if(j % f ==0 &&  l % j ==0 ){
                count++;
            }
        }

        return count;


    }

    private static int lcmA(int number1, int number2) {
        if (number1 == 0 || number2 == 0) {
            return 0;
        }
        int absNumber1 = Math.abs(number1);
        int absNumber2 = Math.abs(number2);
        int absHigherNumber = Math.max(absNumber1, absNumber2);
        int absLowerNumber = Math.min(absNumber1, absNumber2);
        int lcm = absHigherNumber;
        while (lcm % absLowerNumber != 0) {
            lcm += absHigherNumber;
        }
        return lcm;
    }

    public static int lcm(List<Integer> a) {
        int result = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            result = lcmA(result, a.get(i));
        }
        return result;
    }

    private static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    private static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        return a;
    }

//    private static int gcd(List<Integer> b) {
//        int result = b.get(0);
//        for (int i = 1; i < b.size(); i++) {
//            result = gcd(result, b.get(i));
//        }
//        return result;
//    }

    private static int gcdA(int a, int b){
        while( a != b)
        {
            if(a > b)
                a = a - b;
            else
                a = a - b;
        }

        return a;
    }

    private static int gcd(List<Integer> b) {
        int result = b.get(0);
        for (int i = 1; i < b.size(); i++) {
            result = gcdA(result, b.get(i));
        }
        return result;
    }

}

public class BetweenTwoSets {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int total = BetweenTwoSetsResult.getTotalX(arr, brr);

        System.out.println(total);
        //bufferedWriter.write(String.valueOf(total));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
