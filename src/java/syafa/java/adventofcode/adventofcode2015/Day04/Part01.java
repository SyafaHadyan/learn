package syafa.java.adventofcode.adventofcode2015.Day04;
import java.util.*;
import java.io.UnsupportedEncodingException;
import java.security.*;

public class Part01
{
    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String inputKey = input.nextLine();
        try
        {
            byte[] secretKey = inputKey.getBytes("UTF-8");
            MessageDigest secretKeyMD = MessageDigest.getInstance("MD5");
            byte[] MD5Digest = secretKeyMD.digest(secretKey);
        }
        catch (NoSuchAlgorithmException e)
        {
            //
        }
        catch (UnsupportedEncodingException e)
        {
            //
        }
        input.close();
        System.out.println();
    }
}