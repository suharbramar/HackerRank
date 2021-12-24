import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Java2DArray {

    public static boolean inputLoop(int loop) {
        if (loop == 1 || loop == 2 || loop == 1) {

        }

        return true;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        /*
        hourglass = (0,2), (1,3), (3,5)
                  j
        index   0 1 2 3 4 5
          i  0  1 1 1 0 0 0
             1  0 1 0 0 0 0
             2  1 1 1 0 0 0
             3  0 0 2 4 4 0
             4  0 0 0 2 0 0
             5  0 0 1 2 4 0
         */

        int ai = 0;
        int bi = 2;
        int aj = 0;
        int bj = 2;

        int t;
        int loop = 0;
        int limitLoop = 4;
        int sumHourGlasses = 0;

        List<Integer> index_i;
        List<Integer> listSumHourGlasses = new ArrayList<>();
        while(loop < 16){
            int j;
            int iterate = 0;

            for(int i = ai; i <= bi; i++){
                index_i = arr.get(i);
                j = aj;

                while(j <= bj){
                    if(iterate == 1){
                        if(aj == 0){
                            t = bj - j;
                        }else{
                            t = (bj - j) + aj;
                        }
                        if(t == j){
                            sumHourGlasses = sumHourGlasses + index_i.get(j);
                        }
                    }else{
                        sumHourGlasses = sumHourGlasses + index_i.get(j);
                    }
                    j++;
                }
                iterate = iterate + 1;
            }
            //System.out.println(sumHourGlasses);
            listSumHourGlasses.add(sumHourGlasses);

            ai = ai + 1;
            bi = bi + 1;

            loop++;
            sumHourGlasses = 0;

            if(loop == (limitLoop)){
                ai = 0;
                bi = 2;

                aj = aj + 1;
                bj = bj + 1;

                limitLoop = limitLoop + 4;
            }

        }
        System.out.println("Max : "+Collections.max(listSumHourGlasses));

        bufferedReader.close();

    }
}
