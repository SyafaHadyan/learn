package syafa.java.codeinclass;
import java.util.*;
import java.util.stream.*;

public class Array1DSort
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-30s%-2c","Input integers split by space",':');
        int[] array = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.printf("%-30s%-2c","Sort array (Y/N)",':');
        String confirm = input.nextLine();
        boolean sort = (confirm.equalsIgnoreCase("Y"))? (sort = true) : (sort = false);
        if (sort)
        {
            Arrays.sort(array);
        }
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