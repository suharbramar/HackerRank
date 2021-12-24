import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class MigratoryBirdsResult {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
//        HashMap<Integer, Integer> birds = new HashMap<>();
//
//        for(Integer t : arr){
//           if(birds.containsKey(t)){
//               birds.put(t, birds.get(t) + 1);
//           }else{
//               birds.put(t, 1);
//           }
//        }
//
//        return Collections.max(birds.entrySet(), Map.Entry.comparingByValue()).getKey();

          Map<Integer,Integer> birds = arr.stream().collect(Collectors.toMap(Function.identity(), v -> 1, Integer::sum));
          int key = Collections.max(birds.entrySet(), Map.Entry.comparingByValue()).getKey();
          int max = Collections.max(birds.entrySet(), Map.Entry.comparingByValue()).getValue();
      System.out.println("birds : "+birds);
      System.out.println("key : "+key + "\n max : "+max);


        return 1;

    }
    /*
    6
1 4 4 4 5 3

11
1 2 3 4 5 4 3 2 1 3 4

     */

}

public class MigratoryBirds {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = MigratoryBirdsResult.migratoryBirds(arr);
        System.out.println("result : "+result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
      //  bufferedWriter.close();
    }
}