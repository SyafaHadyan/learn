package syafa.java.hackerrank.Algorithms.BitManipulation;
import java.util.*;
import java.util.stream.*;

public class LonelyInteger
{
    static class checkArray
    {
        public static int uniqueElement(int[] array)
        {
            Arrays.sort(array);
            for (int i = 1; i < array.length; i++)
            {
                try
                {
                    if (array[i] != array[i + 1] && array[i] != array[i - 1])
                    {
                        return array[i];
                    }
                }
                catch (IndexOutOfBoundsException e)
                {
                    return array[array.length - 1];
                }
            }
            return array[0];
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numberAmount = Integer.parseInt(input.nextLine());
        int[] number = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        System.out.print(checkArray.uniqueElement(number));
        input.close();
    }
}