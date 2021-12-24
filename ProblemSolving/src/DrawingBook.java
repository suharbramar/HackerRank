import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DrawingBookResult {

    /*
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

    /*
    input :
    n = 6
    page = 2

    1	(2-3)	(4-5)   6
    hal   lembar
    1		1
    2-3     2
    4-5     3
    6-7     4
     */
    public static int pageCount(int n, int p) {

        int pageFront = 0;
        int pageBack = 0;

//        pageFront = 1;
//        while(pageFront < (p - 2)){
//            pageFront++;
//        }
//73201
//57075
        //95073
        //17440
        //ex : 8720

        //5809
        //2668
        // ex : 1334
        pageFront = p /2;

        if( n == p || (n-1) == p){
            if(p % 2 == 0){
                pageBack = 0;
            }else{
                pageBack = (n-1) == p ? n / p : 0;
            }

        }else{

                pageBack = (n - p) / 2;

           // pageBack = (n / p ) - 1 == 0 ? (n - p) / 2 : (n / p ) - 1;
        }


        System.out.println("Page Front : "+pageFront);
        System.out.println("Page Back : "+pageBack);

        //p = p % 2 != 0 ? p - 1 : p;

//        if(p % 2 !=0){
//            p = p - 1;
//        }else {
//            p = p;
//        }
//
//        int result = 0;
//        if((n - p) < p){
//            result = n - p;
//        }else{
//            result = p;
//        }
//
//        return result / 2;

        //return (n - p < p ? n - p : p) / 2;

        return Integer.min(pageFront, pageBack);
    }

}

public class DrawingBook {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int result = DrawingBookResult.pageCount(n, p);

        System.out.println("result : "+result);
        //bufferedWriter.write(String.valueOf(result));
       // bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
