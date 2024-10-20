package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class HalloweenSale
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] initialSetup = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int gameCount = 0;
        input.close();
        if (initialSetup[3] < initialSetup[0])
        {
            System.out.print(0);
            return;
        }
        while (initialSetup[3] >= 0)
        {
            initialSetup[3] -= initialSetup[0];
            gameCount++;
            if (initialSetup[0] - initialSetup[1] >= initialSetup[2])
            {
                initialSetup[0] -= initialSetup[1];
            }
            else if (initialSetup[0] - initialSetup[1] < initialSetup[2])
            {
                initialSetup[0] = initialSetup[2];
            }
            if (initialSetup[3] - initialSetup[0] < 0)
            {
                break;
            }
        }
        System.out.print(gameCount);
    }
}