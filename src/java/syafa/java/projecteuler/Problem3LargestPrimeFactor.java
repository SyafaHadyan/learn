package syafa.java.projecteuler;
import java.math.*;

public class Problem3LargestPrimeFactor
{
    static final BigInteger NUMBER = new BigInteger("13195");
    public static void main(String[] args)
    {
        BigInteger maxPrimeFactor = BigInteger.ZERO;
        for (BigInteger i = BigInteger.ONE; i.compareTo(NUMBER) < 0; i = i.add(BigInteger.ONE))
        {
            if (NUMBER.divideAndRemainder(i)[1].compareTo(BigInteger.ZERO) == 0 && i.isProbablePrime(10))
            {
                maxPrimeFactor = i;
            }
        }
        System.out.print(maxPrimeFactor);
    }
}