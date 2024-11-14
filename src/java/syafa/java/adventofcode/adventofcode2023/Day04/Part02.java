package syafa.java.adventofcode.adventofcode2023.Day04;
import java.util.*;

public class Part02
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int cardAmount = 0;
        while (input.hasNextLine())
        {
            try
            {
                input.next();
            }
            catch (NoSuchElementException e)
            {
                break;
            }
            input.next();
            ArrayList<Integer> winningNumbers = new ArrayList<>();
            while (input.hasNextInt())
            {
                winningNumbers.add(input.nextInt());
            }
            input.next();
            while (input.hasNextInt())
            {
                int tempCardOwn = input.nextInt();
                if (winningNumbers.contains(tempCardOwn))
                {
                    cardAmount++;
                }
            }
            cardAmount++;
        }
        input.close();
        System.out.print(cardAmount);
    }
}