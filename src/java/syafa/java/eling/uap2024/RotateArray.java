package syafa.java.eling.uap2024;
import java.util.*;

public class RotateArray
{
    private static int[][] rotateArrayReturn(int[][] array, int rotationAmount)
    {
        int[][] rotatedArray = new int[array.length][array.length];
        for (int i = 0; i < rotationAmount % 4; i++)
        {
            for (int j = 0; j < rotatedArray.length; j++)
            {
                for (int k = 0; k < rotatedArray.length; k++)
                {
                    rotatedArray[j][k] = array[rotatedArray.length - 1 - k][j];
                }
            }
            for (int j = 0; j < rotatedArray.length; j++)
            {
                for (int k = 0; k < rotatedArray.length; k++)
                {
                    array[j][k] = rotatedArray[j][k];
                }
            }
        }
        return array;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arraySize = input.nextInt();
        int rotationAmount = input.nextInt(); input.nextLine();
        int[][] array = new int[arraySize][arraySize];
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                array[i][j] = input.nextInt();
            }
            if (array.length - i != 1)
            {
                input.nextLine();
            }
        }
        input.close();
        array = rotateArrayReturn(array,rotationAmount);
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                System.out.print(array[i][j] + ((array.length - j != 1) ? " " : "\n"));
            }
        }
    }
}