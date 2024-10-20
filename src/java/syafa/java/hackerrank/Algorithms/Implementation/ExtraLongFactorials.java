package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.math.*;

public class ExtraLongFactorials
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        input.close();
        BigInteger result = BigInteger.valueOf(number);
        for (int i = number - 2; i > 0; i--)
        {
            result = result.add(result.multiply(BigInteger.valueOf(i)));
        }
        System.out.print(result);
    }
}