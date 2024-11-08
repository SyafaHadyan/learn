package syafa.java.hackerrank.BigNumber;
import java.util.*;
import java.math.*;

public class JavaBigInteger
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        BigInteger firstNumber = input.nextBigInteger();
        input.nextLine();
        BigInteger secondNumber = input.nextBigInteger();
        input.close();
        System.out.print(firstNumber.add(secondNumber) + "\n" + firstNumber.multiply(secondNumber));
    }
}