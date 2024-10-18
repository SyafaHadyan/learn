package syafa.java.codeinclass.array;
import java.util.*;
import java.math.*;

public class Array1D
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        BigInteger arraySize = new BigInteger(input.nextLine());
        input.close();
        BigInteger totalSum = BigInteger.ZERO;
        int[] array = new int[Integer.parseInt(String.valueOf(arraySize))];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = i;
            System.out.print(array[i]);
            totalSum = BigInteger.valueOf(Long.valueOf(String.valueOf(totalSum)) + i);
            if (array.length - i != 1)
            {
                System.out.print("\n");
            }
        }
        System.out.printf("\n%-15s%-2c%d\n%-15s%-2c%d","Array size",':',arraySize,"Total sum",':',totalSum);
    }
}