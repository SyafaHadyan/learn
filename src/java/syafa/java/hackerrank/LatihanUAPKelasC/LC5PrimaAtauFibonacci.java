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
    public static boolean fibonacciSequence(int[] number)
    {
        for (int i = 2; i < number.length; i++)
        {
            int firstNumber = number[i - 2];
            int secondNumber = number[i - 1];
            int currentNumber = firstNumber + secondNumber;
            if (number[i] != currentNumber)
            {
                return false;
            }
        }
        return true;
    }
    public static boolean arithmeticSequence(int[] number)
    {
        int difference = number[1] - number[0];
        for (int i = 0; i < number.length; i++)
        {
            if (i != 0 && number[i] - number[i - 1] != difference)
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
        if (primeSequence(numberSequence))
        {
            System.out.println("Kumpulan Bilangan Prima");
            return;
        }
        if (fibonacciSequence(numberSequence))
        {
            System.out.println("Deret Bilangan Fibonacci");
            return;
        }
        if (arithmeticSequence(numberSequence))
        {
            System.out.println("Deret Bilangan Aritmetika");
            return;
        }
        System.out.println("Kumpulan bilangan tidak dikenali");
    }
    /*
     * [x] Prime
     * [x] Fibonacci
     * [x] Arithmetic
     */
}