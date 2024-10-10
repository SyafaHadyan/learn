package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;

public class Day20Sorting
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arraySize = Integer.parseInt(input.nextLine());
        ArrayList<String> inputArrayString = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        input.close();
        Integer[] a = new Integer[inputArrayString.size()];
        for (int i = 0; i < inputArrayString.size(); i++)
        {
            
        }
        for (int i = 0; i < arraySize; i++)
        {
            // Track number of elements swapped during a single array traversal
            int numberOfSwaps = 0;
            
            for (int j = 0; j < arraySize - 1; j++)
            {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    swap(a[j], a[j + 1]);
                    numberOfSwaps++;
                }
            }
            
            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0)
            {
                break;
            }
        }
    }

    private static void swap(int i, int j)
    {
        Integer[] a = new Integer[2];
        Integer temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}