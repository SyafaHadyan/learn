package syafa.java.codeinclass;
import java.util.*;
import java.util.stream.*;

public class Array1DSort
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] array = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        input.close();
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]);
            if (array.length - i != 1)
            {
                System.out.print("\n");
            }
        }
    }
}