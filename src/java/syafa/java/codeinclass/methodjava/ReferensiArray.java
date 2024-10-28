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
        System.out.printf("%-30s,%d","The sum is",arrayOperation.sumArray(array));
        System.out.println("The sorted array is");
        int[] sortedArray = arrayOperation.sortArray(array);
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(sortedArray);
            if (array.length - i != 1)
            {
                System.out.print(' ');
            }
        }
        input.close();
    }
}