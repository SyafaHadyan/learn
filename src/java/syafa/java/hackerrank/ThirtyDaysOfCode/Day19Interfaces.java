package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;

public class Day19Interfaces
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        int sumDivisor = 0;
        input.close();
        for (int i = 1; i <= number; i++)
        {
            if (number % i == 0)
            {
                sumDivisor += i;
            }
        }
        System.out.print("I implemented: AdvancedArithmetic" + "\n" + sumDivisor);
    }
}