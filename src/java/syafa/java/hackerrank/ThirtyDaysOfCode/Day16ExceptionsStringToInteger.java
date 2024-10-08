package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;

public class Day16ExceptionsStringToInteger
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        input.close();
        try
        {
            System.out.print(Integer.parseInt(userInput));
        }
        catch (NumberFormatException e)
        {
            System.out.print("Bad String");
        }
    }
}