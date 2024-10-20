package syafa.java.hackerrank.Algorithms.Sorting;
import java.util.*;
import java.util.stream.*;

public class CountingSort2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        StringBuilder useless = new StringBuilder(input.nextLine());
        useless.delete(0,useless.length());
        int[] array = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]);
            if (array.length - i != 1)
            {
                System.out.print(' ');
            }
        }
    }
}