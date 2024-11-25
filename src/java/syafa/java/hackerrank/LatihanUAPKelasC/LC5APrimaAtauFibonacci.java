package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC5APrimaAtauFibonacci
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
    public static int primeSequence(int number)
    {
        int currentNumber = -1;
        int currentPrimeAt = 0;
        while (currentNumber < number)
        {
            currentNumber++;
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numberAmount = Integer.parseInt(input.nextLine());
        int[] numberList = new int[numberAmount];
        for (int i = 0; i < numberList.length; i++)
        {
            numberList[i] = Integer.parseInt(input.nextLine());
        }
        input.close();
        for (int i = 0; i < numberList.length; i++)
        {
            //
        }
    }
}