import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

class AnagramResult {

    /*
     * Complete the 'anagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int anagram(String s) {
        // Write your code here
        //a a a b b b
        //0 1 2 3 4 5
         if(s.length() % 2 ==0){
           int divided = s.length() / 2;
           char[] chString = s.toCharArray();

           int i = 0;
           int j = 0;
           char[] chString1 = new char[divided];
           char[] chString2 = new char[divided];
           while(i < s.length()){
               if(i < divided){
                   chString1[i] = chString[i];
               }else{
                   chString2[j] = chString[i];
                   j++;
               }
             i++;
           }

           Arrays.sort(chString1);
           Arrays.sort(chString2);

           String str2 = String.valueOf(chString2);

           int countReplace = 0;
           for(int k =0 ; k < divided; k++){
              int index = str2.indexOf(chString1[k]);
              if(index == -1){
                  countReplace++;
              }
              else{
                  str2 = str2.substring(0,index) + str2.substring(index+1);
              }
           }

           return countReplace;

         }

         return -1;
    }



}

public class Anagram {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = AnagramResult.anagram(s);

                //bufferedWriter.write(String.valueOf(result));
                System.out.println(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
