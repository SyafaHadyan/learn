package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class ModifiedKaprekarNumbers
{
    private static boolean isKaprekar(long number)
    {
        String numberString = String.valueOf(Math.abs(number));
        long leftNumber = 0;
        long rightNumber = 0;
        rightNumber = Long.parseLong(numberString.substring(numberString.length() / 2,numberString.length()));
        if (numberString.length() % 2 == 0)
        {
            leftNumber = Long.parseLong(numberString.substring(0,numberString.length() / 2));
        }
        else
        {
            leftNumber = Long.parseLong(numberString.substring(0,(numberString.length() / 2) - 1));
        }
        return ((leftNumber + rightNumber) == number);
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        long lowerBound = Long.parseLong(input.nextLine());
        long upperBound = Long.parseLong(input.nextLine());
        input.close();
        for (long i = lowerBound; i <= upperBound; i++)
        {
            //
        }
    }
}