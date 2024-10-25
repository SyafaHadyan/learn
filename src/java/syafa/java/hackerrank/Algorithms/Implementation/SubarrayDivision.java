package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class SubarrayDivision
{
    public static void main(String[] args)
    {
        /*
         * 5
         * 1 2 1 3 2
         * 3 2
         * 
         * 2
         * 
         * 2 squares summing 3
         * possible combination:
         * index    0 1
         *          1 2
         * 
         * index    1 2
         *          2 1
         * 
         * 
         * 
         * 6
         * 1 1 1 1 1 1
         * 3 2
         * 
         * 0
         * 
         * no possible combination of 2 squares summing 3
         * 
         * 1
         * 4
         * 4 1
         * 
         * 1
         * 
         * only 1 possible combination of 1 square summing 4
         * 
         * print 4
         */
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