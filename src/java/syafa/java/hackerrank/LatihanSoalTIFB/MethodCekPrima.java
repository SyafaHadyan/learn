package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;
import java.math.*;

public class MethodCekPrima
{
    public static void main(String[] args)
    {
        primeCheck();
    }
    public static void primeCheck()
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
            if (numberCheck[i].isProbablePrime(100))
            {
                checkResult[i] = numberCheck[i] + " = " + "Prima";
                continue;
            }
            checkResult[i] = numberCheck[i] + " = " + "Bukan prima";
        }
        input.close();
        for (int i = 0; i < checkResult.length; i++)
        {
            System.out.print(checkResult[i]);
            if (i != checkResult.length - 1)
            {
                System.out.print("\n");
            }
        }
    }
}