package syafa.java.hackerrank.Algorithms.Warmup;
import java.util.*;

public class DiagonalDifference
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int size = Integer.parseInt(input.nextLine());
        int result0 = 0;
        int result1 = 0;
        int result = 0;
        int[][] inputInteger = new int[size][size];
        for (int i = 0; i < size; i++)
        {
            String inputArray[] = input.nextLine().split(" ");
            for (int j = 0; j < size; j++)
            {
                inputInteger[i][j] = Integer.parseInt(inputArray[j]);
            }
        }
        input.close();
        for (int i = 0; i < size; i++)
        {
            result0 += inputInteger[i][i];
            result1 += inputInteger[i][size - i - 1];
        }
        result = Math.abs(result0 - result1);
        System.out.print(result);
    }
}