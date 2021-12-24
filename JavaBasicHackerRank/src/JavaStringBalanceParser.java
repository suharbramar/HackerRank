//BALANCE PARSER LOGIC

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;



public class JavaStringBalanceParser {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        HashMap<String, String> elBraces = new HashMap<>();
        elBraces.put("(",")");
        elBraces.put("{","}");
        elBraces.put("[","]");

        Stack<String> braces = new Stack<>();
        while (sc.hasNext()) {
            //Complete the code
            String input = sc.next();
            String strInput[] = input.split("");
            for(int i = 0;i < strInput.length; i++){
                braces.add(strInput[i]);
            }

            boolean isBalance = false;
            String closeBrace = "";
            String top = "";
            String last = "";
            process : while(braces.size() > 0){
                 top = braces.firstElement();

                 if("{".equals(top) || "(".equals(top) || "[".equals(top)) {
                     closeBrace = elBraces.get(top);
                 }else{
                     last = braces.pop();
                     if(!top.equalsIgnoreCase(last)){
                         braces.remove(last);
                     }
                     isBalance = false;
                     braces.remove(top);
                     continue process;
                 }

                 if(braces.search(closeBrace) > 0){
                     isBalance = true;
                     braces.remove(closeBrace);
                 }else{
                     isBalance = false;
                 }

                braces.remove(top);
            }

           System.out.println(isBalance);

        }
    }
}
