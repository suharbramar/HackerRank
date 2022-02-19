import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

class TwoStringsResult {

    /*
     * Complete the 'twoStrings' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static String twoStrings(String s1, String s2) {
        // Write your code here
        Set<String> set1 = new HashSet<>();

        char[] arrString1 = s1.toCharArray();
        for(char i : arrString1){
            set1.add(String.valueOf(i));
        }

        Set<String> set2 = new HashSet<>();

        char[] arrString2 = s2.toCharArray();
        for(char i : arrString2){
            set2.add(String.valueOf(i));
        }

        Set<String> intersectSet = new HashSet<>(set1);
        intersectSet.retainAll(set2);

        if(intersectSet.size() > 0){
            return "YES";
        }

        return "NO";

    }

}

public class TwoStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s1 = bufferedReader.readLine();

                String s2 = bufferedReader.readLine();

                String result = TwoStringsResult.twoStrings(s1, s2);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
