package syafa.java.hackerrank.DataStructures.Arrays;
import java.util.*;
import java.util.stream.*;

public class TwoDimensionArrayDS
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[][] hourGlass = new int[6][6];
        int currentMaxValue = Integer.MIN_VALUE;
        for (int i = 0; i < hourGlass.length; i++)
        {
            hourGlass[i] = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                if (hourGlass[i][j] +
                    hourGlass[i][j + 1] +
                    hourGlass[i][j + 2] +
                    hourGlass[i + 1][j + 1] +
                    hourGlass[i + 2][j] +
                    hourGlass[i + 2][j + 1] +
                    hourGlass[i + 2][j + 2] >
                    currentMaxValue)
                {
                    currentMaxValue =
                    hourGlass[i][j] +
                    hourGlass[i][j + 1] +
                    hourGlass[i][j + 2] +
                    hourGlass[i + 1][j + 1] +
                    hourGlass[i + 2][j] +
                    hourGlass[i + 2][j + 1] +
                    hourGlass[i + 2][j + 2];
                }
            }
        }
        input.close();
        System.out.print(currentMaxValue);
    }
}