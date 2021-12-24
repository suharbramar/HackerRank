import java.util.HashMap;
import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] aChar =  a.toCharArray();
        char[] bChar =  b.toCharArray();

        HashMap<String, Integer> mapA = new HashMap<String, Integer>();
        HashMap<String, Integer> mapB = new HashMap<String, Integer>();

        String key = "";
        for(int i = 0; i < aChar.length; i++){
            key = String.valueOf(aChar[i]).toLowerCase();
            if(mapA.containsKey(key)){
                mapA.put(key, mapA.get(key) + 1);
            }else{
                mapA.put(key, 1);
            }
        }

        for(int i = 0; i < bChar.length; i++){
            key = String.valueOf(bChar[i]).toLowerCase();
            if(mapB.containsKey(key)){
                mapB.put(key, mapB.get(key) + 1);
            }else{
                mapB.put(key, 1);
            }
        }


        System.out.println(mapA);
        System.out.println(mapB);

        return mapA.equals(mapB);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
