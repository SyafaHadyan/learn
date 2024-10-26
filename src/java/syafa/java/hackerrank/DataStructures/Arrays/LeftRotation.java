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
            //
        }
    }
}