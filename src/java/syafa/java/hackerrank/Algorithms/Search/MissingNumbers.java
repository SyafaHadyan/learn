package syafa.java.hackerrank.Algorithms.Search;
import java.util.*;
import java.util.stream.*;

public class MissingNumbers
{
    static class compareArray
    {
        public static void missingElements(List<Integer> firstArray,List<Integer> secondArray)
        {
            int[] missing = new int[secondArray.size() - firstArray.size()];
            Set<Integer> missingNumbers = new HashSet<>();
            Collections.sort(firstArray);
            Collections.sort(secondArray);
            int counter = 0;
            for (int i = 0; i < secondArray.size(); i++)
            {
                try
                {
                    if (secondArray.get(i).equals(firstArray.get(i)))
                    {
                        secondArray.remove(i);
                        firstArray.remove(i);
                        i--;
                        continue;
                    }
                    if ((secondArray.get(i) != firstArray.get(i)))
                    {
                        missing[counter] = secondArray.get(i);
                        secondArray.remove(i);
                        counter++;
                        i--;
                        continue;
                    }
                }
                catch (IndexOutOfBoundsException e)
                {
                    //
                }
            }
            for (Integer i : missing)
            {
                missingNumbers.add(i);
            }
            Collections.sort(missingNumbers);
            for (Integer i : missingNumbers)
            {
                System.out.print(i + " ");
            }
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
         * 
         * 3670 3674 3677 3684 3685 3685 3695 3714 3720
         * 3670 3674 3677 3684 3685      3695 3714 3720
         * 3670 3674 3677 3684 3685 3685 3695 3714 3720
         * 
         * 3670 3674 3677 3684 3685 3685 3695 3714 3720
         * 3670 3674 3677 3684 3685 3685 3695 3714 3720
         * 3670 3674 3677 3684 3685 3695 3714 3720
         * 3670 3674 3677 3684 3685 3685 3695 3714 3720
         * 3670 3674 3677 3684 3685 3695 3714 3720
         * 3670 3674 3677 3684 3685 3695 3714 3720
         * 
         * 3670 3674 3677 3684 3685 3695 3714 3720
         * 3714 3684 3685 3670 3720 3674 3677 3695
         */
        Scanner input = new Scanner(System.in);
        int firstArrayLength = Integer.parseInt(input.nextLine());
        List<Integer> firstArray = Arrays.stream(input.nextLine().split("\s")).map(Integer::valueOf).collect(Collectors.toList());
        //int[] firstArray = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        int secondArrayLength = Integer.parseInt(input.nextLine());
        List<Integer> secondArray = Arrays.stream(input.nextLine().split("\s")).map(Integer::valueOf).collect(Collectors.toList());
        //int[] secondArray = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        input.close();
        compareArray.missingElements(firstArray,secondArray);
    }
}