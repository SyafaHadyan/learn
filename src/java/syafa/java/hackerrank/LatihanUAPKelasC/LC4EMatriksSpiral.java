package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;
import java.util.stream.*;

public class LC4EMatriksSpiral
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int matrixSize = Integer.parseInt(input.nextLine());
        int[][] matrix = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrix.length; i++)
        {
            matrix[i] = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        }
        input.close();
    }
}