package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;

public class Day16ExceptionsStringToInteger
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        try
        {
            System.out.print(Integer.parseInt());
        }
        catch (NumberFormatException e)
        {
            // TODO: handle exception
        }
        input.close();
    }
}