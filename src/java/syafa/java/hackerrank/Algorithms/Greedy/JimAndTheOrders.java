package syafa.java.hackerrank.Algorithms.Greedy;
import java.util.*;
import java.util.stream.*;

public class JimAndTheOrders
{
    public static void main(String[] args)
    {
        /*
         * Customer     1	2	3	4	5
         * Order #		8	5	6	2	4
         * Prep time	3	6	2	3	3
         * Calculate:
         * Serve time	11	11	8	5	7
         * 
         * return customerServeOrder
         * 
         * 4 5 3 1 2
         * 
         * 3
         * 1 3
         * 2 3
         * 3 3
         * 
         * 1 2 3
         * 
         * 5
         * 8 1
         * 4 2
         * 5 6
         * 3 1
         * 4 3
         * 
         * 4 2 5 1 3
         * 
         */
        Scanner input = new Scanner(System.in);
        int customerAmount = Integer.parseInt(input.nextLine());
        int[] custommerPreparation = new int[customerAmount];
        int[][] customerPreparationTime = new int[customerAmount][2];
        //ArrayList<Integer> customerPreparationTime = new ArrayList<>();
        for (int i = 0; i < customerAmount; i++)
        {
            custommerPreparation = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            customerPreparationTime[i][0] = i + 1;
            customerPreparationTime[i][1] = custommerPreparation[0] + custommerPreparation[1];
        }
        input.close();
        for (int i = 0; i < customerPreparationTime.length; i++)
        {
            for (int j = 0; j < customerPreparationTime[i].length; j++)
            {
                System.out.print(customerPreparationTime[i][j]);
                if (customerPreparationTime[i].length - j != 1)
                {
                    System.out.print(' ');
                }
            }
            if (customerPreparationTime.length - i != 1)
            {
                System.out.print("\n");
            }
        }
    }
}