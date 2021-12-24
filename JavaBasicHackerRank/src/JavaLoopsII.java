import java.util.*;
import java.io.*;

public class JavaLoopsII {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int tmp = a;
            int factor = 1;
            for(int j = 0 ;j < n; j++){
                    tmp = tmp + (factor * b);
                    factor = factor * 2;
                    System.out.print(tmp+" ");
            }
        }
        in.close();
    }
}
