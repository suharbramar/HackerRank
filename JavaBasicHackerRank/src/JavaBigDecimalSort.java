import java.math.BigDecimal;
import java.util.*;

public class JavaBigDecimalSort {
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1 == null || o2 == null){
                      return 0;
                }
                BigDecimal o1bd = new BigDecimal(o1);
                BigDecimal o2bd = new BigDecimal(o2);

                 if(o1bd.compareTo(o2bd) > 0 ){
                     return -1;
                 }

                 return 1;
            }
        });

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
