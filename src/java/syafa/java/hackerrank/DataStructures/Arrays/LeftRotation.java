package syafa.java.hackerrank.DataStructures.Arrays;
import java.util.*;
import java.util.stream.*;

public class LeftRotation
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] arrayRotation = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] array = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        for (int i = 0; i < arrayRotation[1]; i++)
        {
            int temp = array[0];
            for (int j = 0; j < array.length - 1; j++)
            {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = temp;
        }
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