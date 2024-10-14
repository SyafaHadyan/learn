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
        for (int i = 0; i < check; i++)
        {
            numberCheck[i] = Integer.parseInt(input.next());
        }
        for (int i = 0; i < numberCheck.length; i++)
        {
            for (int j = 2; j < numberCheck[i]; j++)
            {
                if (numberCheck[i] == 1)
                {
                    //
                    break;
                }
                if ()
                {
                    //
                }
            }
        }
        input.close();
    }
}