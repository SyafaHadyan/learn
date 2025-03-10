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
        if (number <= 1)
        {
            return 0;
        }
        if (number == 2)
        {
            return 1;
        }
        int currentNumber = 1;
        int currentPrimeAt = 1;
        while (currentNumber < number)
        {
            currentNumber += 2;
            if (isPrime(currentNumber))
            {
                currentPrimeAt++;
            }
            if (currentNumber == number && isPrime(number))
            {
                return currentPrimeAt;
            }
        }
        return 0;
    }
    public static int fibonacciSequence(int number)
    {
        if (number == 0)
        {
            return 1;
        }
        if (number == 1)
        {
            return 2;
        }
        int numberCounter = 4;
        int firstNumber = 1;
        int secondNumber = 1;
        int currentNumber = 0;
        while (currentNumber < number)
        {
            currentNumber = firstNumber + secondNumber;
            if (currentNumber == number)
            {
                return numberCounter;
            }
            numberCounter++;
            firstNumber = secondNumber;
            secondNumber = currentNumber;
        }
        return -1;
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
            int primeAt = primeSequence(numberList[i]);
            int fibonacciAt = fibonacciSequence(numberList[i]);
            if (primeAt != 0)
            {
                System.out.print("Bilangan tersebut merupakan bilangan prima ke" + " - " + primeAt);
            }
            if (fibonacciAt != -1)
            {
                System.out.println(((primeAt != 0) ? " dan" : "Bilangan tersebut merupakan") + " bilangan fibonachi ke" + " - " + fibonacciAt + ".");
            }
            else if (primeAt != 0)
            {
                System.out.println(".");
            }
            if (primeAt == 0 && fibonacciAt == -1)
            {
                System.out.println("Bilangan tersebut bukan bilangan prima maupun fibonachi.");
            }
        }
    }
}