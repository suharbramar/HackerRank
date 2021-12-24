import java.util.Scanner;

public class JavaSubarray {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int [] array = new int[n];
        for(int i =0; i < n; i++){
            array[i] = scan.nextInt();
        }

        //int sumA;
        //int sumB;
        int total;
        int count = 0;
        for(int i = 0; i < array.length; i++){
           // sumA = array[i];
            for(int j = i; j < array.length; j++){
                total = 0;
                for(int k = i; k <= j; k++){
                    total = total + array[k];
                }
                if(total < 0){
                    count++;
                }
            }

        }
        System.out.println(count);
    }
}
