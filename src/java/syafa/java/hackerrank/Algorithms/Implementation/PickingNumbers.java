package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class PickingNumbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arrayLength = Integer.parseInt(input.nextLine());
        int[] array = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        Arrays.sort(array);
        int currentMaxSubArray = 0;
        int maxSubArray = 0;
        for (int i = 0; i < array.length - 1; i++)
        {
            if (Math.abs(array[i] - array[i + 1]) <= 1)
            {
                currentMaxSubArray++;
            }
            if (currentMaxSubArray > maxSubArray)
            {
                maxSubArray = currentMaxSubArray;
            }
        }
    }
}