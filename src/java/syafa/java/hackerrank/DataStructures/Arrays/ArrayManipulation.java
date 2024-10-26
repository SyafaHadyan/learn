package syafa.java.hackerrank.DataStructures.Arrays;
import java.util.*;
import java.util.stream.*;

public class ArrayManipulation
{
    public static void main(String[] args)
    {
        /*
         * 5 3
         * 1 2 100
         * 2 5 100
         * 3 4 100
         * 
         * 200
         * 
         * requests are 1 indexed
         * 
         * After the first update the list is   100 100 0 0 0.
         * After the second update list is      100 200 100 100 100.
         * After the third update list is       100 200 200 200 100.
         * The maximum value is 200.
         */
        Scanner input = new Scanner(System.in);
        int[] arraySize = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < arraySize[1]; i++)
        {
            //
        }
        input.close();
    }
}