import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaMD5{

    public static String getMd5(String input){
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());

            BigInteger no = new BigInteger(1, messageDigest);

            String hashText = no.toString(16);

            while(hashText.length() < 32){
                hashText = "0" + hashText;
            }

            return hashText;

        }catch(NoSuchAlgorithmException e){
            throw new RuntimeException(e);
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.next();
        System.out.println(getMd5(password));
    }
}
