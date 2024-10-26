package syafa.java.hackerrank.DataStructures.Arrays;
import java.util.*;
import java.util.stream.*;

public class ArraysDS
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int arraySize = Integer.parseInt(input.nextLine());
        int[] array = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        for (int i = array.length - 1; i >= 0; i--)
        {
            System.out.print(array[i]);
            if (i != 0)
            {
                System.out.print(' ');
            }
        }
    }
}