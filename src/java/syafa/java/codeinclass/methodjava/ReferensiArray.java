package syafa.java.codeinclass.methodjava;
import java.util.*;
import java.util.stream.*;;

public class ReferensiArray
{
    static class arrayOperation
    {
        public static int sumArray(int[] array)
        {
            return IntStream.of(array).sum();
        }
        public static int[] sortArray(int[] array)
        {
            Arrays.sort(array);
            return array;
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] array = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        input.close();
        System.out.println("The sum is" + " " + arrayOperation.sumArray(array));
        System.out.println("The sorted array is");
        int[] sortedArray = arrayOperation.sortArray(array);
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(sortedArray[i]);
            if (array.length - i != 1)
            {
                System.out.print(' ');
            }
        }
    }
}