package syafa.java.hackerrank.DataStructures.Arrays;
import java.util.*;
import java.util.stream.*;

public class LeftRotation
{
    public static void main(String[] args)
    {
        /*
         * 5 4
         * 1 2 3 4 5
         * 
         * 5 1 2 3 4
         * 
         * 1 2 3 4 5
         * 
         * 2 3 4 5 1
         * 
         * 3 4 5 1 2
         * 
         * 4 5 1 2 3
         * 
         * 5 1 2 3 4
         * 
         */
        Scanner input = new Scanner(System.in);
        int[] arrayRotation = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] array = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        for (int i = 0; i < arrayRotation[1]; i++)
        {
            int temp = array[0];
            for (int j = 0; j < array.length - 1; j++)
            {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = temp;
        }
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]);
            if (array.length - i != 1)
            {
                System.out.print(' ');
            }
        }
    }
}