package syafa.java.adventofcode.adventofcode2023.Day04;
import java.util.*;
import java.util.stream.*;

public class Part01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine())
        {
            String card = input.next();
            String cardNumber = input.next();
            ArrayList<Integer> winningNumbers = new ArrayList<>();
            try
            {
                winningNumbers.add(input.nextInt());
            }
            catch (NumberFormatException e)
            {
                //
            }
            /*
            int[] winningNumbers = new int[5];
            for (int i = 0; i < winningNumbers.length; i++)
            {
                
            }
            */
        }
        input.close();
    }
}