package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;

public class Day7
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arrayLength = Integer.parseInt(input.nextLine());
        int numberArray[] = new int [arrayLength - 1];
        for (int i = numberArray.length; i >= 1 ; i--)
        {
            System.out.println(numberArray);
        }
    }
}