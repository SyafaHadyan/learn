package syafa.java.hackerrank.Algorithms.Sorting;
import java.util.*;
import java.util.stream.*;

public class InsertionSortPart2
{
    public static void main(String[] args)
    {
        /*
         * n = 7
         * arr = 3 4 7 5 6 2 1
         * 
         * 3 4 7 5 6 2 1
         * 3 4 7 5 6 2 1
         * 3 4 5 7 6 2 1
         * 3 4 5 6 7 2 1
         * 2 3 4 5 6 7 1
         * 1 2 3 4 5 6 7
         */
        Scanner input = new Scanner(System.in);
        int[] number = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        int counter = 0;
        for (int i = 0; i < number.length; i++)
        {
            try
            {
                if (number[i] < number[i + 1])
                {
                    //
                }
                else if (number[i] > number[i + 1])
                {
                    int[] temp = {number[i], number[i + 1]};
                    number[i] = temp[1];
                    number[i + 1] = temp[0];
                    number[number.length];
                }
            }
            catch (IndexOutOfBoundsException e)
            {
                for (int j = 0; j < number.length; j++)
                {
                    System.out.print(number[j]);
                    if (number.length - j != 1)
                    {
                        System.out.print(' ');
                    }
                }
                i = -1;
                counter++;
                if (number.length - counter == 1)
                {
                    return;
                }
                else
                {
                    System.out.print("\n");
                }
            }
        }
    }
}