package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;

class Result
{
    public static int factorial(int number)
    {
        int factorialResult = 0;
        for (int i = number; i >= 1; i--)
        {
            factorialResult *= i;
            number = number - 1;
        }
        return factorialResult;
    }
}

public class Day9Recursion3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        input.close();
        int result = Result.factorial(number);
        System.out.print(result);
    }
}