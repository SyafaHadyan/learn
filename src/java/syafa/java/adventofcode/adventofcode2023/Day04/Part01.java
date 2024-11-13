package syafa.java.adventofcode.adventofcode2023.Day04;
import java.util.*;
import java.util.stream.*;

public class Part01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int cardPoint = 0;
        while (input.hasNextLine())
        {
            int currentCardPoint = 1;
            input.next();
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
                if (winningNumbers.contains(tempCardOwn) && currentCardPoint != 0)
                {
                    currentCardPoint *= 2;
                }
                else if (winningNumbers.contains(tempCardOwn) && currentCardPoint == 0)
                {
                    currentCardPoint = 1;
                }
            }
            if (currentCardPoint != 0)
            {
                cardPoint += currentCardPoint;
                continue;
            }
            /*
            int[] winningNumbers = new int[5];
            for (int i = 0; i < winningNumbers.length; i++)
            {
                
            }
            */
        }
        input.close();
        System.out.print(cardPoint);
    }
}