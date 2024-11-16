package syafa.java.projecteuler;
import java.math.*;

public class Problem2
{
    static final BigInteger MAX_FIBONACCI_SEQUENCE_VALUE = new BigInteger("4000000");
    public static void main(String[] args)
    {
        BigInteger fibonacciSum = BigInteger.ZERO;
        BigInteger firstNumber = BigInteger.ONE;
        BigInteger secondNumber = BigInteger.TWO;
        BigInteger currentNumber = firstNumber.add(secondNumber);
        for (BigInteger i = BigInteger.TWO; i.compareTo(MAX_FIBONACCI_SEQUENCE_VALUE) < 0; i.add(BigInteger.ONE));
        {
            if (currentNumber.divideAndRemainder(BigInteger.TWO)[1].compareTo(BigInteger.ZERO) == 0)
            {
                fibonacciSum = fibonacciSum.add(currentNumber);
            }
        }
    }
}