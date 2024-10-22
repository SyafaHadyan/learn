package syafa.java.hackerrank.Algorithms.BitManipulation;
import java.util.*;
import java.util.stream.*;

public class LonelyInteger
{
    public static void main(String[] args)
    {
        /*
         * 3
         * 1 1 2
         * 
         * 2
         * 
         * 2 is the only unique integer (does not repeat inside)
         * 
         * 5
         * 0 0 1 2 1
         * 
         * 2
         * 
         * 2 is the only unique integer
         * 
         * 1
         * 1
         * 
         * 1
         * 
         * 1 is the only element inside
         * 
         * int[] input arr > sort >
         * if (i == i + 1)
         * {
         *      currentNumber = i;
         *      continue;
         * }
         * else if (i != i + 1)
         * {
         *      if (i != currentNumber)
         *      {
         *          if (i != 1 + 1)
         *          {
         *              print i;
         *          }
         *      }
         * }
         * 
         */
        Scanner input = new Scanner(System.in);
        int arraySize = Integer.parseInt(input.nextLine());
        int[] number = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        int currentNumber = Integer.MIN_VALUE;
        Arrays.sort(number);
        for (int i = 0; i < number.length; i++)
        {
            if (number[i] == i + 1)
            {
                currentNumber = i;
            }
            else if (number[i] != number[i + 1])
            {
                if (number[i + 1] != currentNumber)
                {
                    if (number[i + 1] != number[i + 2])
                    {
                        System.out.print(number[i + 1]);
                    }
                }
            }
        }
    }
}