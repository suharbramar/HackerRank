import java.util.Scanner;
import java.lang.*;
import java.io.*;

public class JavaOutputFormatting{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1 = sc.next();
            int x = sc.nextInt();

            s1 = String.format("%"+(-15)+"s", s1).replace("","");
            String t = String.format("%1$"+3+"s", x).replace(" ","0");
            System.out.println(s1 +""+t);

            //Complete this line
        }
        System.out.println("================================");

    }
}



