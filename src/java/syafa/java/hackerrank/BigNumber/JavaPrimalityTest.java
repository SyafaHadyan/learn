package syafa.java.hackerrank.BigNumber;
import java.math.*;
import java.util.*;

public class JavaPrimalityTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        BigInteger number = new BigInteger(input.nextLine());
        System.out.print(number.isProbablePrime(100));
    }
}