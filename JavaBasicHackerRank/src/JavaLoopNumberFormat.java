import java.io.IOException;
import java.util.Scanner;

public class JavaLoopNumberFormat {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //int N = Integer.parseInt(bufferedReader.readLine().trim());

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d%n", N, i, N*i);
            // System.out.println(" "+N+" x "+i+" = "+(N*i));
        }

        // bufferedReader.close();
    }
}
