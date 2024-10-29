package syafa.java.hackerrank.Algorithms.Sorting;
import java.util.*;
import java.util.stream.*;

public class InsertionSortPart2
{
    static class sort
    {
        public static void insertionSort(int[] array)
        {
            boolean swap = false;
            for (int i = 1; i < array.length; ++i)
            {
                int k = array[i];
                int j = i - 1;
                while (j >= 0 && array[j] > k)
                {
                    array[j + 1] = array[j];
                    j = j - 1;
                    swap = true;
                }
                array[j + 1] = k;
                if (swap)
                {
                    swap = false;
                    for (int l = 0; l < array.length; l++)
                    {
                        System.out.print(array[l]);
                        if (array.length - l != 1)
                        {
                            System.out.print(' ');
                        }
                        if (array.length - l == 1)
                        {
                            System.out.print("\n");
                        }
                    }
                }
            }
        }
    }
    public static void main(String[] args)
    {
        /*
         * n = 7
         * arr = 3 4 7 5 6 2 1
         * 
         * # Third Try
         * 
         * [x]3 4 7 5 6 2 1
         * [x]3 4 7 5 6 2 1
         * [x]3 4 5 7 6 2 1
         * [x]3 4 5 6 7 2 1
         * [x]2 3 4 5 6 7 1
         * [x]1 2 3 4 5 6 7
         * 
         * [x]3 4 7 5 6 2 1
         * [x]3 4 7 5 6 2 1
         * [x]3 4 5 7 6 2 1
         * [x]3 4 5 6 7 2 1
         * [x]2 3 4 5 6 7 1
         * [x]1 2 3 4 5 6 7
         * 
         * # Second Try
         * 
         * [x]3 4 7 5 6 2 1
         * [x]3 4 7 5 6 2 1
         * [x]3 4 5 7 6 2 1
         * [ ]3 4 5 6 7 2 1
         * [ ]2 3 4 5 6 7 1
         * [ ]1 2 3 4 5 6 7
         * 
         * [x]3 4 7 5 6 2 1
         * [x]3 4 7 5 6 2 1
         * [x]3 4 5 7 6 2 1
         * [ ]2 3 4 5 7 6 1
         * [ ]1 2 3 4 5 7 6
         * 
         * # First Try
         * 
         * [x]3 4 7 5 6 2 1
         * [x]3 4 7 5 6 2 1
         * [x]3 4 5 7 6 2 1
         * [x]3 4 5 6 7 2 1
         * [ ]2 3 4 5 6 7 1
         * [ ]1 2 3 4 5 6 7
         * 
         * [x]3 4 7 5 6 2 1
         * [x]3 4 7 5 6 2 1
         * [x]3 4 5 7 6 2 1
         * [x]3 4 5 6 7 2 1
         * [ ]3 4 5 6 2 7 1
         * [ ]3 4 5 6 2 1 7
         */
        Scanner input = new Scanner(System.in);
        int arrayLength = Integer.parseInt(input.nextLine());
        //int[] number = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        sort.insertionSort(Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray());
        input.close();
    }
}