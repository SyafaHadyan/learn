package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;
import java.math.*;

public class PerulanganPrimaKeN
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int primeAt = Integer.parseInt(input.nextLine());
        input.close();
        int currentPrimeAt = 0;
        BigInteger currentPrime = BigInteger.ZERO;
        for (int i = 1; i <= primeAt;)
        {
            if (currentPrime.isProbablePrime(100))
            {
                currentPrimeAt++;
                if (currentPrimeAt == primeAt)
                {
                    System.out.print(currentPrime);
                    return;
                }
            }
        }
    }
}