import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.time.DayOfWeek;
import java.time.LocalDate;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String mh = String.format("%1$"+2+"s", month).replace(" ","0");
        String dy = String.format("%1$"+2+"s", day).replace(" ","0");
        Date d = simpleDateFormat.parse(year+"-"+mh+"-"+dy);
//        Calendar c = Calendar.getInstance();
//        c.setTime(d);
//
//        int dayOfTheWeek = c.get(Calendar.DAY_OF_WEEK);

        String dayWeekText = new SimpleDateFormat("EEEE").format(d).toUpperCase(Locale.ROOT);

        /* SIMPLE WAY */
//        LocalDate localDate = LocalDate.of(year, month, day);
//        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
//        return dayOfWeek.toString();

//        return LocalDate.of(year, month, day).getDayOfWeek().name();
        return dayWeekText;
    }



}

public class JavaDateTime{
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        System.out.println("result : "+res);

       // bufferedWriter.write(res);
       // bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
