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
    
                // Move elements of arr[0..i-1], that are
                // greater than key, to one position ahead
                // of their current position
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
        input.close();
    }
}