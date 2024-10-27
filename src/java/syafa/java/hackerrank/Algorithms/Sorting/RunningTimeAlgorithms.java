package syafa.java.hackerrank.Algorithms.Sorting;
import java.util.*;
import java.util.stream.*;

public class RunningTimeAlgorithms
{
    static class sort
    {
        public static int insertionSort(int[] array)
        {
            int swapAmount = 0;
            int n = array.length;
            for (int i = 1; i < n; ++i)
            {
                int k = array[i];
                int j = i - 1;
                while (j >= 0 && array[j] > k)
                {
                    array[j + 1] = array[j];
                    j = j - 1;
                    swapAmount++;
                }
              
                array[j + 1] = k;
            }
            return swapAmount;
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        StringBuilder useless = new StringBuilder(input.nextLine());
        useless.delete(0,useless.length());
        int[] array = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        System.out.print(sort.insertionSort(array));
        input.close();
    }
}