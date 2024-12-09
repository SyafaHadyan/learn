package syafa.java.eling.uap2024;
import java.util.*;
import java.util.stream.*;

public class RotateArray
{
    private static void rotateArray(int[][] array)
    {
        int[] horizontalPosition = new int[2];
        int[] verticalPosition = new int[2];
        for (int i = 0; i <= array.length; i++)
        {
            do
            {
                try
                {
                    int tempSwap = array[verticalPosition[1]][verticalPosition[0]];
                    array[verticalPosition[1]][verticalPosition[0]] = array[horizontalPosition[1]][horizontalPosition[0]];
                    array[horizontalPosition[1]][horizontalPosition[0]] = tempSwap;
                    horizontalPosition[1]++;
                    verticalPosition[0]++;
                }
                catch (ArrayIndexOutOfBoundsException e)
                {
                    break;
                }
            }
            while
            (
                (horizontalPosition[1] != verticalPosition[0])
            );
            horizontalPosition[1] = 0;
            verticalPosition[0] = 0;
            horizontalPosition[0]++;
            verticalPosition[1]++;
            System.err.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arraySize = input.nextInt();
        int rotationAmount = input.nextInt(); input.nextLine();
        int[][] array = new int[arraySize][arraySize];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        }
        input.close();
        for (int i = 0; i < rotationAmount; i++)
        {
            rotateArray(array);
        }
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                System.out.print(array[i][j] + ((array.length - j != 1) ? " " : "\n"));
            }
        }
    }
}