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
        //String[] inputArray = new String[size];
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
            for (int j = 0; j < size; j++)
            {
                result0 += Math.abs(inputInteger[i][j]);
                result1 += Math.abs(inputInteger[0].length - inputInteger[j].length);
                result = Math.abs(result0 - result1);
            }
        }
        System.out.print(result);
    }
}