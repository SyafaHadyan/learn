package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;

public class Day7
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arrayLength = Integer.parseInt(input.nextLine());
        int numberArray[] = new int [arrayLength];
        for (int i = 0; i < arrayLength; i++)
        {
            int number = Integer.parseInt(input.nextLine());
            numberArray[i] = number;
        }
        input.close();
        for (int i = numberArray.length; i >= 1 ; i--)
        {
            int numberArrayAt = numberArray[arrayLength - i];
            System.out.println(numberArrayAt);
        }
    }
}