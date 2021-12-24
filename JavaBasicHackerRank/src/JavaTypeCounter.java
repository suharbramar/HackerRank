import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



class JavaTypeCounterResult {

    /*
     * Complete the 'typeCounter' function below.
     *
     * The function accepts STRING sentence as parameter.
     */

    public static int countString(String a){
        int count = 0;
        try{
            int n = Integer.parseInt(a);
        }
        catch(NumberFormatException e){
            try{
                Double d = Double.parseDouble(a);
            }
            catch(NumberFormatException t){
                count++;
            }
        }

        return count;

    }

    public static int countInteger(String a){
        int count = 0;
        try{
            int n = Integer.parseInt(a);
            count++;
        }
        catch(NumberFormatException e){
        }

        return count;
    }

    public static int countDouble(String a){

        int count = 0;
        try{
            Double d = Double.parseDouble(a);
            if(d % 1 !=0){
                count++;
            }

        }
        catch(NumberFormatException e){
            try{
                int n = Integer.parseInt(a);

                if(n % 1 !=0){
                    count++;
                }
            }catch(NumberFormatException t){

            }

        }

        return count;

    }
    public static void typeCounter(String sentence) {
        String data[] = sentence.split(" ");

        int outputString = 0;
        int outInt = 0;
        int outDouble = 0;

        for(String input : data){
//           outputString += countString(input);
//           outInt += countInteger(input);
//           outDouble += countDouble(input);
            if(input.matches("\\d+")){
               outInt++;
            }else if(input.matches("\\d*[.]\\d+")){
                outDouble++;
            }else{
                outputString++;
            }
        }

        System.out.print("string "+outputString+"\n" +
                "integer "+outInt+"\n" +
                "double "+outDouble
        );
    }

}

public class JavaTypeCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String sentence = bufferedReader.readLine();

        JavaTypeCounterResult.typeCounter(sentence);

        bufferedReader.close();
    }
}
