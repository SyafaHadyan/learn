package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class PickingNumbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        StringBuilder useless = new StringBuilder(input.nextLine());
        useless.delete(0,useless.length());
        int[] array = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        Arrays.sort(array);
        int currentMaxSubArray = 1;
        int maxSubArray = 0;
        int currentVal = 0;
        for (int i = 0; i < array.length - 1; i++)
        {
            if (currentMaxSubArray == 1)
            {
                currentVal = array[i];
            }
            if (Math.abs(currentVal - array[i + 1]) <= 1)
            {
                currentMaxSubArray++;
            }
            if (currentMaxSubArray > maxSubArray)
            {
                maxSubArray = currentMaxSubArray;
            }
            if (Math.abs(currentVal - array[i + 1]) > 1)
            {
                currentMaxSubArray = 1;
            }
        }
        System.out.print(maxSubArray);
    }
}