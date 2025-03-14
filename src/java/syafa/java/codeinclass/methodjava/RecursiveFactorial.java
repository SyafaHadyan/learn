package syafa.java.codeinclass.methodjava;
import java.util.*;
import java.math.*;

public class RecursiveFactorial
{
    class factorial
    {
        public static BigInteger factorialIteration(int number)
        {
            BigInteger result = BigInteger.valueOf(number);
            if (number <= 1)
            {
                return result;
            }
            for (int i = number - 2; i > 0; i--)
            {
                result = result.add(result.multiply(BigInteger.valueOf(i)));
            }
            return result;
        }
        public static int factorialRecursive(int number)
        {
            if (number != 1)
            {
                return (number * (number - 1));
            }
            return number;
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        input.close();
        //int recursiveNumber = number;
        System.out.println("Result using iteration is" + ' ' + factorial.factorialIteration(number));
        //System.out.print("Result using recursive is" + ' ' + factorial.factorialRecursive(recursiveNumber));
    }
}