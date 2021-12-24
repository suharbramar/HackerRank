import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class SubArrayDivisionResult {

    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here

        if(s.size() == 1){
            return 1;
        }

        if(s.stream().distinct().count() <= 1){
            return 0;
        }

        int x;
        int j;
        int tmp;
        int countSegment = 0;
        for(int i =0; i < s.size(); i++){
            x = s.get(i);
            j = (i + 1);
            tmp = 1;
            while(tmp < m && j < s.size()){
                x = x + s.get(j);

                tmp++;
                j++;
            }
            if(x == d){
               countSegment++;
            }

        }
        return countSegment;

    }

}

public class SubArrayDivision{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        int result = SubArrayDivisionResult.birthday(s, d, m);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
        System.out.println("result : "+result);
        bufferedReader.close();
//        bufferedWriter.close();
    }
}
