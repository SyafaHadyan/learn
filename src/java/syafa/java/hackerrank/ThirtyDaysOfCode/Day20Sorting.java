package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;
import java.util.stream.*;

public class Day20Sorting
{
    static class sortArray
    {
        public static int bubbleSort(int[] array)
        {
            int numberOfSwap = 0;
            for (int i = 0; i < array.length - 1; i++)
            {
                for (int j = 0; j < array.length - i - 1; j++)
                {
                    if (array[j] > array[j + 1])
                    {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        numberOfSwap++;
                    }
                }
            }
            return numberOfSwap;
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arrayLength = Integer.parseInt(input.nextLine());
        int[] array = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        System.out.print("Array is sorted in" + " " + 0 + " " + "swaps" + "." + "\n" + "First element" + ":" + " " + 0 + "\n" + "Last element" + ":" + " " + 0);
    }
}