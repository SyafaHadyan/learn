package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC4EMatriksSpiral
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int matrixSize = Integer.parseInt(input.nextLine());
        int upperBound = 0;
        int lowerBound = matrixSize;
        int leftBound = 0;
        int rightBound = matrixSize;
        int[][] matrix = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = input.nextInt();
            }
            if (matrix.length - i != 1)
            {
                input.nextLine();
            }
        }
        input.close();
        while (upperBound != matrixSize || leftBound != matrixSize)
        {
            for (int i = leftBound; i < rightBound; i++)
            {
                System.out.print(((i == 0) ? "" : " ") + matrix[upperBound][i]);
            }
            upperBound++;
            for (int i = upperBound; i < lowerBound; i++)
            {
                System.out.print(" " + matrix[i][rightBound - 1]);
            }
            rightBound--;
            for (int i = rightBound; i > leftBound; i--)
            {
                System.out.print(" " + matrix[lowerBound - 1][i - 1]);
            }
            lowerBound--;
            for (int i = lowerBound; i > upperBound; i--)
            {
                System.out.print(" " + matrix[i - 1][leftBound]);
            }
            leftBound++;
        }
        System.out.print("\n");
    }
}