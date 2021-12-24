import java.util.*;
import java.util.Scanner;

// Write your code here. DO NOT use an access modifier in your class declaration.
class Parser{
    static String isBalanced(String s)
    {

        char[] x;
        x = s.toCharArray();

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i <x.length; i++){
            String t = String.valueOf(x[i]);
            if(map.containsKey(t)){
                map.put(t, map.get(t) + 1);
            }else{
                map.put(t, 1);
            }
        }

        int sum = map.values().stream().reduce(0, Integer::sum);
        return String.valueOf(sum);


    }

    }


class BalanceParser {

    public static void main(String[] args) {
        Parser parser = new Parser();

        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            System.out.println(parser.isBalanced(in.next()));
        }

        in.close();
    }
}