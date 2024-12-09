package syafa.java.eling.uap2024;
import java.util.*;
import java.util.stream.*;

public class RotateArray
{
    private static void rotateArray(int[][] array)
    {
        int[] horizontalPosition = new int[2];
        int[] verticalPosition = new int[2];
        for (int i = 0; i < array.length - 1; i++)
        {
            horizontalPosition[1]++;
            verticalPosition[0]++;
            //
            for (int j = 0; j < 2; j++)
            {
                horizontalPosition[j] = 0;
                verticalPosition[j] = 0;
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arraySize = Integer.parseInt(input.nextLine());
        int rotationAmount = Integer.parseInt(input.nextLine());
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