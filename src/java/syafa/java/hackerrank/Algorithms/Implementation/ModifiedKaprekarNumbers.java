package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

public class ModifiedKaprekarNumbers
{
    private static boolean isMultipleOfTen(long number)
    {
        while (number % 10 == 0 && number >= 1)
        {
            number /= 10;
        }
        return (number == 1);
    }
    private static boolean isKaprekar(long number)
    {
        if (number == 1)
        {
            return true;
        }
        if (isMultipleOfTen(number))
        {
            return false;
        }
        String numberString = String.valueOf((long) Math.pow(number,2));
        long leftNumber = 0;
        long rightNumber = 0;
        rightNumber = Long.parseLong(numberString.substring(numberString.length() / 2,numberString.length()));
        try
        {
            leftNumber = Long.parseLong(numberString.substring(0,numberString.length() / 2));
        }
        catch (StringIndexOutOfBoundsException e)
        {
            return false;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
        return ((leftNumber + rightNumber) == number);
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        long lowerBound = Long.parseLong(input.nextLine());
        long upperBound = Long.parseLong(input.nextLine());
        input.close();
        ArrayList<Long> kaprekarNumberList = new ArrayList<>();
        for (long i = lowerBound; i <= upperBound; i++)
        {
            if (isKaprekar(i))
            {
                kaprekarNumberList.add(i);
            }
        }
        for (int i = 0; i < kaprekarNumberList.size(); i++)
        {
            System.out.print(kaprekarNumberList.get(i) + ((kaprekarNumberList.size() - i != 1) ? " " : "\n"));
        }
        if (kaprekarNumberList.size() == 0)
        {
            System.out.println("INVALID RANGE");
        }
    }
}