package syafa.java.projecteuler;
import java.math.*;

public class Problem3LargestPrimeFactor
{
    static final BigInteger NUMBER = new BigInteger("600851475143");
    public static void main(String[] args)
    {
        BigInteger maxPrimeFactor = BigInteger.ZERO;
        for (BigInteger i = NUMBER.subtract(BigInteger.ONE); i.compareTo(BigInteger.ZERO) > 0; i = i.subtract(BigInteger.ONE))
        {
            if (NUMBER.divideAndRemainder(i)[1].compareTo(BigInteger.ZERO) == 0 && i.isProbablePrime(10))
            {
                maxPrimeFactor = i;
                break;
            }
        }
        System.out.print(maxPrimeFactor);
    }
}