package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class SubarrayDivision
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        StringBuilder useless = new StringBuilder(input.nextLine());
        useless.delete(0,useless.length());
        int[] chocolate = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] request = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        int possibleCombination = 0;
        for (int i = 0; i < chocolate.length; i++)
        {
            int counter = 0;
            for (int j = 0; j < request[1]; j++)
            {
                try
                {
                    counter += chocolate[i + j];
                }
                catch (IndexOutOfBoundsException e)
                {
                    //
                }
            }
            if (counter == request[0])
            {
                possibleCombination++;
            }
        }
        System.out.print(possibleCombination);
    }
}