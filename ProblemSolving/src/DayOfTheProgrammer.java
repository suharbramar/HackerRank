import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


class DayOfTheProgrammerResult {

    /*
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int year) {
        // Write your code here
        final int dayOfProgrammer = 256;
        List<Integer> calendar = new ArrayList<>();
        calendar.add(0,0);
        calendar.add(1,31);
        calendar.add(2,28);
        calendar.add(3,31);
        calendar.add(4,30);
        calendar.add(5,31);
        calendar.add(6,30);
        calendar.add(7,31);
        calendar.add(8,31);
        calendar.add(9,30);
        calendar.add(10,31);
        calendar.add(11,30);
        calendar.add(12,31);

        Boolean isLeapYear = false;

        if(year >= 1700 && year < 1919){
           if(year % 4 == 0){
               isLeapYear = true;
           }
        }else if(year >= 1919 && year < 2700){
           if(year % 400 == 0 || (year % 4 == 0 && (year % 100 > 0))){
               isLeapYear = true;
           }
        }

        if(isLeapYear){
            calendar.set(2, 29);
        }

        if(year == 1918){
            calendar.set(2, 15);
        }

        int tmp = 0;
        int index = 1;
        while((tmp + calendar.get(index)) < dayOfProgrammer){
            tmp = tmp + calendar.get(index);
            index++;
        }

        String result = (dayOfProgrammer - tmp) +"."+String.format("%02d", index)+"."+year;
        //System.out.println("total days : "+tmp+" \n index : "+index);

        return result;
    }
}

public class DayOfTheProgrammer{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = DayOfTheProgrammerResult.dayOfProgrammer(year);

        System.out.println("result : "+result);
        //bufferedWriter.write(result);
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
