package syafa.java.leetcode;

public class SearchA2DMatrix
{
    class Solution
    {
        public boolean searchRow(int[] matrixRow,int target)
        {
            for (int i = 0; i < matrixRow.length; i++)
            {
                if (matrixRow[i] == target)
                {
                    return true;
                }
            }
            return false;
        }
        public boolean searchMatrix(int[][] matrix,int target)
        {
            for (int i = 1; i < matrix.length; i++)
            {
                if (matrix[i][0] > target && searchRow(matrix[i - 1],target))
                {
                    return true;
                }
            }
            return searchRow(matrix[matrix.length - 1],target);
        }
    }
}