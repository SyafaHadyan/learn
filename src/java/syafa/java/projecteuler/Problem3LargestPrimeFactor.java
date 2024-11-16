package syafa.java.projecteuler;
import java.math.*;

public class Problem3LargestPrimeFactor
{
    static final BigInteger NUMBER = new BigInteger("13195");
    public static boolean checkPrimeFactor(BigInteger number)
    {
        for (int i = 0; i < 0; i++)
        {
            //
        }
        return true;
    }
    public static void main(String[] args)
    {
        for (BigInteger i = BigInteger.ONE; i.compareTo(NUMBER) < 0; i = i.add(BigInteger.ONE))
        {
            if (NUMBER.divideAndRemainder(i)[1].compareTo(BigInteger.ZERO) == 0 && i.isProbablePrime(10))
            {
                //
            }
        }
    }
}