package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;

public class Fibonacci101
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print(fibo(Integer.parseInt(input.nextLine())));
        input.close();
    }
    public static int fibo(int n)
    {
        int firstNumber = 1;
        int secondNumber = 1;
        int currentNumber = 0;
        for (int i = 0; i < n; i++)
        {
            currentNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = currentNumber;
        }
        return currentNumber;
    }
}