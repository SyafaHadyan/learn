package syafa.java.adventofcode.adventofcode2023.Day03;
import java.util.*;

public class Part01
{
    public static boolean isDigit(String inputString)
    {
        try
        {
            Integer.parseInt(inputString);
        }
        catch (NumberFormatException e)
        {
            return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[][] engine = new String[150][150];
        int counter = 0;
        while (input.hasNextLine())
        {
            engine[counter] = input.nextLine().split("");
        }
        input.close();
        for (int i = 0; i < counter; i++)
        {
            int j = 0;
            while (engine[i][j] != null)
            {
                if (isDigit(engine[i][j]))
                j++;
            }
        }
    }
}