import java.io.*;

class ResultCountingValleys{

    public static int getCountingValleys(int steps, String path){

        int v = 0;     // # of valleys
        int lvl = 0;   // current level //sea level
        int count = 0;
        for(char c : path.toCharArray()){
            if(c == 'U'){
                lvl++;
            }
            if(c == 'D'){
                lvl--;
            }

            // if we just came UP to sea level
            if(lvl == 0 && c == 'U'){
                System.out.println("path : "+c+ "count"+count);
                v++;
            }
            count++;
        }
        return v;
    }
}
public class CountingValleys {

    public static void main (String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = ResultCountingValleys.getCountingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
