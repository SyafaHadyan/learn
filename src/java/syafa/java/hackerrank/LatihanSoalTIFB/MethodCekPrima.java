package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;
import java.math.*;

public class MethodCekPrima
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int check = Integer.parseInt(input.nextLine());
        BigInteger[] numberCheck = new BigInteger[check];
        String[] checkResult = new String[check];
        for (int i = 0; i < check; i++)
        {
            numberCheck[i] = input.nextBigInteger();
        }
        for (int i = 0; i < numberCheck.length; i++)
        {
            //
        }
        input.close();
    }
}