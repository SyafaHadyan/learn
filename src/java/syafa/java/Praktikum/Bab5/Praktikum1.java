package syafa.java.Praktikum.Bab5;
import java.util.*;

public class Praktikum1
{
    static int MAX_PRIME_NUMBER = 100;
    public static String checkPrime(int number)
    {
        if (number <= 1)
        {
            return "Bukan prima";
        }
        for (int i = 2; i < number; i++)
        {
            if (number % i == 0)
            {
                return "Bukan prima";
            }
        }
        return "Prima";
    }
    public static void primeToN()
    {
        int counter = 1;
        for (int i = 2; counter <= MAX_PRIME_NUMBER; i++)
        {
            boolean isPrime = true;
            for (int j = 2; j < i; j++)
            {
                if (i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
            {
                counter++;
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-15s%-2c","Masukkan nomor",':');
        int number = Integer.parseInt(input.nextLine());
        input.close();
        System.out.printf("%d%c%s\n",(number),' ',checkPrime(number));
        System.out.println("Bilangan prima hingga" + " " + MAX_PRIME_NUMBER);
        primeToN();
    }
}