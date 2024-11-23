package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC5PrimaAtauFibonacci
{
    public static boolean isPrime(int number)
    {
        if (number <= 1)
        {
            return false;
        }
        for (int i = 2; i < number; i++)
        {
            if (number % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static boolean primeSequence(int[] number)
    {
        for (int i = 0; i < number.length; i++)
        {
            if (!(isPrime(number[i])))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numberAmount = Integer.parseInt(input.nextLine());
        int[] numberSequence = new int[numberAmount];
        for (int i = 0; i < numberSequence.length; i++)
        {
            numberSequence[i] = input.nextInt();
        }
        input.close();
    }
    /*
     * Prime
     * Fibonacci
     * Arithmetic
     */
}