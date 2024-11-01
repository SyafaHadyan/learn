package syafa.java.hackerrank.Algorithms.Search;
import java.util.*;
import java.util.stream.*;

public class SherlockAndArray
{
    static class arrayUtil
    {
        public static void equalSum(int[] array)
        {
            for (int i = 1; i < array.length - 1; i++)
            {
                if (IntStream.of(Arrays.copyOfRange(array,0,(i))).sum() == IntStream.of(Arrays.copyOfRange(array,(i + 1),array.length)).sum())
                {
                    System.out.println("YES");
                }
            }
            if ((IntStream.of(Arrays.copyOfRange(array,1,array.length - 1)).sum() == 0) || (IntStream.of(Arrays.copyOfRange(array,0,array.length - 2)).sum() == 0))
            {
                System.out.println("YES");
            }
            System.out.println("NO");
        }
    }
    public static void main(String[] args)
    {
        /*
         * 2
         * 3
         * 1 2 3
         * 4
         * 1 2 3 3
         * 
         * NO
         * YES
         * 
         * 3
         * 5
         * 1 1 4 1 1
         * 4
         * 2 0 0 0
         * 4
         * 0 0 2 0
         * 
         * YES
         * YES
         * YES
         */
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        String[] result = new String[testCase];
        for (int i = 0; i < testCase; i++)
        {
            int arrayLength = Integer.parseInt(input.nextLine());
            //result[i] = arrayUtil.equalSum(Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray());
            //System.out.println(arrayUtil.equalSum(Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray()));
            arrayUtil.equalSum(Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray());
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