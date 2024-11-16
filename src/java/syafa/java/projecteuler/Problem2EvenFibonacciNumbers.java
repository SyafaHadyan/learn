package syafa.java.projecteuler;
import java.math.*;

public class Problem2EvenFibonacciNumbers
{
    static final BigInteger MAX_FIBONACCI_SEQUENCE_VALUE = new BigInteger("4000000");
    public static void main(String[] args)
    {
        BigInteger fibonacciSum = BigInteger.ZERO;
        BigInteger firstNumber = BigInteger.ZERO;
        BigInteger secondNumber = BigInteger.ONE;
        BigInteger currentNumber = BigInteger.ONE;
        while (currentNumber.compareTo(MAX_FIBONACCI_SEQUENCE_VALUE) < 0)
        {
            if ((currentNumber.divideAndRemainder(BigInteger.TWO)[1]).compareTo(BigInteger.ZERO) == 0)
            {
                fibonacciSum = fibonacciSum.add(currentNumber);
            }
            firstNumber = secondNumber;
            secondNumber = currentNumber;
            currentNumber = firstNumber.add(secondNumber);
        }
        System.out.print(fibonacciSum);
    }
}