package syafa.java.leetcode;
import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix
{
    public static void main(String[] args)
    {
        System.err.println(spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}}));
    }
    public static List<Integer> spiralOrder(int[][] matrix)
    {
        int upperBound = 0;
        int lowerBound = matrix.length;
        int leftBound = 0;
        int currentIterate = 0;
        int rightBound = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        while (upperBound <= matrix.length && leftBound <= matrix[0].length)
        {
            if (currentIterate > 0)
            {
                leftBound++;
            }
            for (int i = leftBound; i < rightBound; i++)
            {
                result.add(matrix[upperBound][i]);
            }
            upperBound++;
            for (int i = upperBound; i < lowerBound; i++)
            {
                result.add(matrix[i][rightBound - 1]);
            }
            rightBound--;
            for (int i = rightBound - 1; i > leftBound; i--)
            {
                result.add(matrix[lowerBound - 1][i - 1]);
            }
            lowerBound--;
            for (int i = lowerBound; i > upperBound; i--)
            {
                result.add(matrix[i - 1][leftBound]);
            }
            currentIterate++;
        }
        return result;
    }
}