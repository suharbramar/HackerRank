import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> myList = new ArrayList<>();
        int t;
        for(int i =0; i < n; i++){
            t = Integer.parseInt(sc.next());
            myList.add(i, t);
        }

        int query = sc.nextInt();
        if(query <= 0 || query > 2){
            throw new Exception("Wrong input, query must have 2");
        }

        for(int j = 0; j < query; j++){
            String command = sc.next();
           // System.out.println("command "+( j + 1)+": "+command);

            if("insert".equalsIgnoreCase(command.toLowerCase())){
                int index = sc.nextInt();
                int values = sc.nextInt();
                myList.add(index, values);
            }
            else if("delete".equalsIgnoreCase(command.toLowerCase())){
                int deletedIndex = sc.nextInt();
                myList.remove(deletedIndex);
            }else {
                throw new Exception("Wrong input queries");
            }
        }
        //myList.forEach(System.out::print);
        Iterator result = myList.iterator();
        while(result.hasNext()){
            System.out.print(result.next() + " ");
          //  System.out.println();
        }
    }
}
