package syafa.java.eling.uap2024;
import java.util.*;
import java.util.stream.*;

public class RotateArray
{
    private static void rotateArray(int[][] array)
    {
        int[] horizontalPositionUp = new int[2];
        int[] horizontalPositionBottom = {array.length - 1,array.length - 1};
        int[] verticalPositionUp = new int[2];
        int[] verticalPositionBottom = {array.length - 1,array.length - 1};
        for (int i = 0; i < array.length; i++)
        {
            do
            {
                int tempSwap = array[verticalPositionUp[1]][verticalPositionUp[0]];
                array[verticalPositionUp[1]][verticalPositionUp[0]] = array[horizontalPositionUp[1]][horizontalPositionUp[0]];
                array[horizontalPositionUp[1]][horizontalPositionUp[0]] = tempSwap;
                horizontalPositionUp[1]++;
                verticalPositionUp[0]++;
            }
            while
            (
                (horizontalPositionUp[1] != verticalPositionUp[0])
            );
            horizontalPositionUp[1] = 0;
            verticalPositionUp[0] = 0;
            horizontalPositionUp[0]++;
            verticalPositionUp[1]++;
            if (array.length - i != 1)
            {
                do
                {
                    int tempSwap = array[verticalPositionBottom[1]][verticalPositionBottom[0]];
                    array[verticalPositionBottom[1]][verticalPositionBottom[0]] = array[horizontalPositionBottom[1]][horizontalPositionBottom[0]];
                    array[horizontalPositionBottom[1]][horizontalPositionBottom[0]] = tempSwap;
                    horizontalPositionBottom[1]--;
                    verticalPositionBottom[0]--;
                }
                while
                (
                    (horizontalPositionBottom[1] != verticalPositionBottom[0])
                );
            }
            horizontalPositionBottom[1] = array.length - 1;
            verticalPositionBottom[0] = array.length - 1;
            horizontalPositionBottom[0]--;
            verticalPositionBottom[1]--;
        }
        for (int i = 0; i < array.length / 2; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                int tempSwap = array[j][array.length - 1 - i];
                array[j][array.length - 1 - i] = array[j][i];
                array[j][i] = tempSwap;
            }
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
        for (int i = 0; i < rotationAmount % 4; i++)
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