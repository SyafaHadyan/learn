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
        if (initialValue.intValue() == 1)
        {
            System.out.print(3);
            return;
        }
        for (BigInteger i = BigInteger.ONE; ; i.add(BigInteger.ONE))
        {
            currentValue.subtract(BigInteger.valueOf(1));
            if (currentValue == BigInteger.ONE)
            {
                initialValue = initialValue.multiply(BigInteger.valueOf(2));
                currentValue = initialValue;
                i.add(BigInteger.ONE);
            }
            if (requestTimeValue.subtract(i) == 1)
            {
                System.out.print(currentValue);
                return;
            }
        }
        System.out.print(1);
    }
}