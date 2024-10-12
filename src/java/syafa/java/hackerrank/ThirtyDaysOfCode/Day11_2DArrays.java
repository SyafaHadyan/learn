package syafa.java.hackerrank.ThirtyDaysOfCode;
import java.util.*;

public class Day11_2DArrays
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[][] hourGlass = new int[6][6];
        int currentMaxValue = 0;
        for (int i = 0; i < 6; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                hourGlass[i][j] = Integer.parseInt(input.next());
            }
        }
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                if (hourGlass[i][j] +
                    hourGlass[i][j] +
                    hourGlass[i][j] +
                    hourGlass[i][j] +
                    hourGlass[i][j] +
                    hourGlass[i][j] +
                    hourGlass[i][j] >
                    currentMaxValue)
                {
                    currentMaxValue = hourGlass[i][j];
                }
            }
        }
        input.close();
    }
}