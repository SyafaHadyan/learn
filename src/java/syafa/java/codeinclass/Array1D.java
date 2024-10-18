package syafa.java.codeinclass;
import java.util.*;

public class Array1D
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arraySize = Integer.parseInt(input.nextLine());
        input.close();
        int totalSum = 0;
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++)
        {
            array[i] = i;
            System.out.print(array[i]);
            totalSum += i;
            if (arraySize - i != 1)
            {
                System.out.print("\n");
            }
        }
        System.out.printf("\n%-15s%-2c%d\n%-15s%-2c%d","Array size",':',arraySize,"Total sum",':',totalSum);
    }
}