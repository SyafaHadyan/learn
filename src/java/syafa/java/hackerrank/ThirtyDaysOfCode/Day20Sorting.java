package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;
import java.util.stream.*;

public class Day20Sorting
{
    static class sortArray
    {
        public static int[] bubbleSort(int[] array)
        {
            int[] result = new int[3];
            for (int i = 0; i < array.length - 1; i++)
            {
                for (int j = 0; j < array.length - i - 1; j++)
                {
                    if (array[j] > array[j + 1])
                    {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        result[2]++;
                    }
                }
            }
            result[0] = array[0];
            result[1] = array[array.length - 1];
            return result;
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        StringBuilder useless = new StringBuilder(input.nextLine());
        useless.delete(0,useless.length());
        int[] array = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        System.out.print
        (
            "Array is sorted in" + " " + sortArray.bubbleSort(array)[2] + " " + "swaps" + "." + "\n" +
            "First Element" + ":" + " " + sortArray.bubbleSort(array)[0] + "\n" +
            "Last Element" + ":" + " " + sortArray.bubbleSort(array)[1]
        );
    }
}