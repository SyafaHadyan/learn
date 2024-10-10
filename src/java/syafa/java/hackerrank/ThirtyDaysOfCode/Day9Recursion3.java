package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;

public class Day9Recursion3
{
    private static int factorial(int number)
{
    int factorialResult = 1;
    for (int i = number; i >= 1; i--)
    {
        factorialResult *= i;
        number = number - 1;
    }
    System.out.print(factorialResult);
    return factorialResult;
}
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        input.close();
        factorial(number);
        System.out.print(factorial(number));
    }
}