package syafa.java.hackerrank.Algorithms.Search;
import java.util.*;
import java.util.stream.*;

public class SherlockAndArray
{
    static class arrayUtil
    {
        public static String equalSum(int[] array)
        {
            for (int i = 0; i < array.length; i++)
            {
                if (IntStream.of(Arrays.copyOfRange(array,0,i)).sum() == IntStream.of(Arrays.copyOfRange(array,i,array.length - 1)).sum())
                {
                    return "YES";
                }
            }
            if (IntStream.of(Arrays.copyOfRange(array,1,array.length)).sum() == 0)
            {
                return "YES";
            }
            return "NO";
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        String[] result = new String[testCase];
        for (int i = 0; i < testCase; i++)
        {
            int arrayLength = Integer.parseInt(input.nextLine());
            result[i] = arrayUtil.equalSum(Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray());
        }
        input.close();
        for (int i = 0; i < result.length; i++)
        {
            System.out.print(result[i]);
            if (result.length - i != 1)
            {
                System.out.print("\n");
            }
        }
    }
}