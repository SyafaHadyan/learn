package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;
import java.util.stream.*;

public class MengurutkanArray
{
    public static int[] sortArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0 + i; j < array.length; j++)
            {
                if (array[i] > array[j])
                {
                    int tempSwap = array[i];
                    array[i] = array[j];
                    array[j] = tempSwap;
                }
            }
        }
        return array;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arrayLength = Integer.parseInt(input.nextLine());
        int[] data = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        input.close();
        sortArray(data);
        for (int i = 0; i < arrayLength; i++)
        {
            System.out.print(data[i]);
            if (data.length - i != 1)
            {
                System.out.print(' ');
            }
        }
    }
}