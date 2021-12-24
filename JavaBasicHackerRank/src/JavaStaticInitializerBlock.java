import java.util.Scanner;

public class JavaStaticInitializerBlock {

    static Scanner scan = new Scanner(System.in);
    static int B = scan.nextInt();
    static int H = scan.nextInt();
    static Boolean flag;

    static{

        if(B <= 0 || H <= 0){
            flag = false;
            try {
                throw new Exception("Breadth and height must be positive");
            } catch (Exception e) {
                System.out.println(e);
            }
        }else{
            flag = true;
        }


    }

    public static void main(String[] args){

        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class


