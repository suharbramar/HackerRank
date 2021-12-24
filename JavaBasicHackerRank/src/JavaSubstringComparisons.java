import java.util.HashSet;
import java.util.Scanner;

public class JavaSubstringComparisons{

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        //welcometojava
        int strLength = s.length();

        String temp = "";
        /*
        SOLUTION 1 : USING HASHSET

         */
        HashSet<String> hashSet = new HashSet<>();
        for(int i = 0; i <= (strLength - k); i++){
            temp = s.substring(i,(i +k));

            hashSet.add(temp);

        }
       // hashSet.forEach(System.out::println);
        smallest = hashSet.stream().max(String::compareToIgnoreCase).get();
        largest = hashSet.stream().min(String::compareToIgnoreCase).get();

        return smallest + "\n" + largest;



            /*
            SOLUTION 2 : USING ALGORITHM

        smallest = s.substring(0,k);
        largest = s.substring(0,k);

        for(int i = 1; i <= (strLength - k); i++){

            temp = s.substring(i,(i +k));


            if(temp.compareTo(smallest) < 0){
               smallest = temp;
            }

            if(temp.compareTo(largest) > 0){
                largest = temp;
            }

        }

             */
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}