package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class ServiceLane
{
    public static void main(String[] args)
    {
        /*
         * highwayLength testCase
         * serviceLane ... serivceLane
         * testCase testCase
         * ...
         * testCase testCase
         * 
         *    |HIGHWAY|Lane|    ->    Width
         * 0: |       |--|            2
         * 1: |       |---|           3
         * 2: |       |-|             1
         * 3: |       |--|            2
         * 4: |       |---|           3
         * 5: |       |--|            2
         * 6: |       |---|           3
         * 7: |       |---|           3
         * 8 5
         * 2 3 1 2 3 2 3 3
         * 0 3
         * 4 6
         * 6 7
         * 3 5
         * 0 7
         * 1
         * 2
         * 3
         * 2
         * 1
         */
        Scanner input = new Scanner(System.in);
        int[] highwayCar = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] servieLane = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] result = new int[highwayCar[1]];
        for (int i = 0; i < highwayCar[2]; i++)
        {
            int[] temp = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = temp[0]; j < temp[1]; j++)
            {
                //
            }
        }
        input.close();
    }
}