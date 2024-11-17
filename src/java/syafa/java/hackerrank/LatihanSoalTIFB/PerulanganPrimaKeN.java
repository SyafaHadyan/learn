package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.*;

public class PerulanganPrimaKeN
{
    public static boolean isPrime(int number)
    {
        for (int i = 2; i < number; i++)
        {
            if (number % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int primeAt = Integer.parseInt(input.nextLine());
        input.close();
        int currentPrimeAt = 0;
        int currentNumber = 1;
        while (currentPrimeAt != primeAt)
        {
            currentNumber++;
            if (isPrime(currentNumber))
            {
                currentPrimeAt++;
            }
        }
        System.out.print(currentNumber);
    }
}