package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.math.*;

public class StrangeCounter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        BigInteger requestTimeValue = input.nextBigInteger();
        input.close();
        BigInteger initialValue = BigInteger.valueOf(3);
        BigInteger currentValue = BigInteger.valueOf(3);
        BigInteger time = BigInteger.ONE;
        if (initialValue.intValue() == 1)
        {
            System.out.print(3);
            return;
        }
        /* TODO: Fix this */
        while (time.compareTo(requestTimeValue) <= 0)
        {
            currentValue.subtract(BigInteger.valueOf(1));
            if (currentValue == BigInteger.ONE)
            {
                initialValue = initialValue.multiply(BigInteger.valueOf(2));
                currentValue = initialValue;
                time.add(BigInteger.ONE);
            }
            if (requestTimeValue.subtract(time) == BigInteger.ONE)
            {
                System.out.print(currentValue);
                return;
            }
        }
        System.out.print(1);
    }
}