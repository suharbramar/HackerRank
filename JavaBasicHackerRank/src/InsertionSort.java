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

class InsertionResult {

    /*
     * Complete the 'insertionSort1' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort1(int n, List<Integer> arr) {
        // Write your code here
        //[2,4,6,8,3]
        // 0 1 2 3 4
        int valueFromLastIndex = arr.get(arr.size() - 1);
        int indexRight = arr.size() - 2;
        while(indexRight >= 0 && arr.get(indexRight) > valueFromLastIndex){
            arr.set(indexRight + 1, arr.get(indexRight));
            print(arr);
            indexRight--;
        }
        arr.set(indexRight + 1, valueFromLastIndex);
        print(arr);

    }

    public static void print(List<Integer> arr){
        arr.forEach(integer -> {
            System.out.print(integer+" ");
        });
        System.out.println();
    }

}

public class InsertionSort {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        InsertionResult.insertionSort1(n, arr);

        bufferedReader.close();
    }
}
