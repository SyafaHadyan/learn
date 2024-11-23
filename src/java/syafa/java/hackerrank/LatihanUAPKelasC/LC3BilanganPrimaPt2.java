package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC3BilanganPrimaPt2
{
    public static boolean isPrime(int number)
    {
        for (int i = 2; i < number; i++)
        {
            if (number % i == 0)
            {
                System.err.println("False at " + i);
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
            System.err.println("CPA " + currentPrimeAt + "\n" + "CPN " + currentNumber);
        }
        System.err.println("CPA " + currentPrimeAt + "\n" + "CPN " + currentNumber);
        System.out.println("bilangan prima ke" + "-" + primeAt + " " + "adalah" + " " + currentNumber + ".");
    }
}