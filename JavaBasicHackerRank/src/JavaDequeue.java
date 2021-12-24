import java.util.*;

public class JavaDequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        Set<Integer> uniqueNumber = new HashSet<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = Integer.MIN_VALUE;

        /*
        6 3
        5 3 5 2 3 2
         */
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            uniqueNumber.add(num);

            if(deque.size() == m){
                if(uniqueNumber.size() > max){
                    max = uniqueNumber.size();
                }
                int first = (int)deque.removeFirst();
                if(!deque.contains(first)){
                    uniqueNumber.remove(first);
                }
            }
        }
        System.out.println(max);
    }
}
