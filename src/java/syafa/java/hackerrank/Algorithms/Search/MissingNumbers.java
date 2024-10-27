package syafa.java.hackerrank.Algorithms.Search;
import java.util.*;
import java.util.stream.*;

public class MissingNumbers
{
    static class compareArray
    {
        public static int[] missingElements(int[] firstArray,int[] secondArray)
        {
            int[] missing = new int[secondArray.length - firstArray.length];
            Arrays.sort(firstArray);
            Arrays.sort(secondArray);
            for (int i = 0; i < secondArray.length; i++)
            {
                if ((secondArray[i] != firstArray[i] || i > firstArray.length))
                {
                    missing[i] = secondArray[i];
                }
            }
            return missing;
        }
    }
    public static void main(String[] args)
    {
        /*
         * 10
         * 203 204 205 206 207 208 203 204 205 206
         * 13
         * 203 204 204 205 206 207 205 208 203 206 205 206 204
         * 
         * 204 205 206
         */
        Scanner input = new Scanner(System.in);
        int firstArrayLength = Integer.parseInt(input.nextLine());
        int[] firstArray = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        int secondArrayLength = Integer.parseInt(input.nextLine());
        int[] secondArray = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        input.close();
    }
}