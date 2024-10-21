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
        int currentValue = 3;
        if (requestTimeValue == 1)
        {
            System.out.print(3);
            return;
        }
        for (int i = 1; i < requestTimeValue; i++)
        {
            currentValue--;
            if (currentValue == 1)
            {
                initialValue = initialValue.multiply(BigInteger.valueOf(2));
                currentValue = initialValue;
                i++;
            }
            if (requestTimeValue - i == 1)
            {
                System.out.print(currentValue);
                return;
            }
        }
        System.out.print(1);
    }
}