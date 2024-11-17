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
        int currentPrimeAt = 1;
        int currentNumber = 2;
        while (currentPrimeAt != primeAt)
        {
            if (isPrime(currentNumber))
            currentNumber++;
        }
        System.out.print(currentNumber);
    }
}