package syafa.java.hackerrank.Algorithms.Search;
import java.util.*;
import java.util.stream.*;

public class MissingNumbers
{
    static class compareArray
    {
        public static int[] missingElements(List<Integer> firstArray,List<Integer> secondArray)
        {
            int[] missing = new int[secondArray.size() - firstArray.size()];
            Collections.sort(firstArray);
            Collections.sort(secondArray);
            for (int i = 0; i < secondArray.size(); i++)
            {
                if (secondArray.get(i) == firstArray.get(i))
                {
                    secondArray.remove(i);
                    firstArray.remove(i);
                    i--;
                }
                if ((secondArray.get(i) != firstArray.get(i) || i > firstArray.size()))
                {
                    missing[i] = secondArray.get(i);
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
        List<Integer> firstArray = Arrays.stream(input.nextLine().split("\s")).map(Integer::valueOf).collect(Collectors.toList());
        //int[] firstArray = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        List<Integer> secondArray = Arrays.stream(input.nextLine().split("\s")).map(Integer::valueOf).collect(Collectors.toList());
        //int[] secondArray = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        int[] result = compareArray.missingElements(firstArray,secondArray);
        input.close();
    }
}