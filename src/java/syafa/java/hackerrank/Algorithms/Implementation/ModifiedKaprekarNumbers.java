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
            System.out.print(kaprekarNumberList.get(i) + ((kaprekarNumberList.size() - i != 1) ? " " : ""));
        }
        if (kaprekarNumberList.size() == 0)
        {
            System.out.println("INVALID RANGE");
        }
    }
}