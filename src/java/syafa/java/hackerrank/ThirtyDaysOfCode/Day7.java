package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;

public class Day7
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arrayLength = Integer.parseInt(input.nextLine());
        String inputArrays = input.nextLine();
        String[] numberArray = inputArrays.split(" ");
        input.close();
        for (int i = 1; i <= numberArray.length ; i++)
        {
            String numberArrayAt = numberArray[arrayLength - i];
            System.out.println(numberArrayAt);
        }
    }
}