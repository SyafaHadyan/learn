package syafa.java.hackerrank.LatihanSoalTIFB;
import java.util.Scanner;

public class PerulanganPrimaKeN
{
    public static boolean isPrime(int number)
    {
        for (int i = 2; i < Math.sqrt(number); i++)
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
        int currentNumber = 1;
        while (currentPrimeAt < primeAt)
        {
            currentNumber += 2;
            if (isPrime(currentNumber))
            {
                currentPrimeAt++;
            }
        }
        System.out.print((primeAt == 1) ? 2 : currentNumber);
    }
}