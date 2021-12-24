import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaCurrencyFormatter{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();

        scanner.close();
        Locale localeIndia = new Locale("en","IN");
       // String myString = NumberFormat.getInstance().format(payment);
        String usString = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String indiaString = NumberFormat.getCurrencyInstance(localeIndia).format(payment);
        String chinaString = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String franceString = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        // Write your code here.
        //System.out.println("Locale : "+myString);
        System.out.println("US : "+usString);
        System.out.println("India : "+indiaString);
        System.out.println("China : "+chinaString);
        System.out.println("France : "+franceString);
        //System.out.println("French : "+nf.format(payment));

//        System.out.println("US: " + us);
//        System.out.println("India: " + india);
//        System.out.println("China: " + china);
//        System.out.println("France: " + france);
    }
}