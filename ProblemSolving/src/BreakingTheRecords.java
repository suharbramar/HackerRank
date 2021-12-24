import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class BreakingTheRecordsResult {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here

        List<Integer> highestScore = new ArrayList<>();
        List<Integer> lowestScore = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        highestScore.add(0,scores.get(0));
        lowestScore.add(0,scores.get(0));

        int countHighestScore = 0;
        int countLowestScore = 0;
        for(int i = 1; i < scores.size() ;i++){
            if(scores.get(i) > highestScore.get(i - 1)){
                 highestScore.add(i, scores.get(i));
                 countHighestScore++;
              }else{
                     highestScore.add(i,highestScore.get(i - 1));
              }

              if(scores.get(i) < lowestScore.get(i - 1)){
                     lowestScore.add(i, scores.get(i));
                     countLowestScore++;
              }else{
                     lowestScore.add(i, lowestScore.get(i - 1));
              }
       }

        result.add(0, countHighestScore);
        result.add(1, countLowestScore);

        return result;

    }

}

public class BreakingTheRecords{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = BreakingTheRecordsResult.breakingRecords(scores);

        result.stream().map(Integer::intValue).forEach(System.out::println);
//        bufferedWriter.write(
//                result.stream()
//                        .map(Object::toString)
//                        .collect(joining(" "))
//                        + "\n"
//        );

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
