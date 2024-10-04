package syafa.java.hackerrank.BigNumber;
import java.math.*;
import java.util.*;

public class JavaPrimalityTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        BigInteger number = new BigInteger(input.nextLine());
        input.close();
        if (number.isProbablePrime(100))
        {
            System.out.print("prime");
            return;
        }
        System.out.print("not prime");
    }
}