package syafa.java.hackerrank.Algorithms.Warmup;
import java.util.*;

public class DiagonalDifference
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int size = Integer.parseInt(input.nextLine());
        int n = 0;
        int inputString = 0;
        int result0 = 0;
        int result1 = 0;
        int result = 0;
        String[][] inputArray = new String[size - 1][];
        int[][] inputInteger = new int[size - 1][size - 1];
        for (int i = 0; i < size; i++)
        {
            inputArray[i][n] = Arrays.toString(input.nextLine().split(""));
            n++;
            for (int j = 0; j < inputArray.length; j++)
            {
                inputInteger[i][j] = Integer.parseInt(Arrays.toString(inputArray));
            }
        }
        input.close();
        /*
        if (size % 2 != 0)
        {
            
            result0 = Math.abs(inputInteger.get(0) + inputInteger.get((inputInteger.size() / 2)) + inputInteger.get(inputInteger.size() - 1));
            result1 = Math.abs(inputInteger.get(size - 1) + inputInteger.get((inputInteger.size() / 2)) + inputInteger.get(size * (size - 1)));
            result  = Math.abs(result0 - result1);
            
        }
        else
        {
            
            // TODO: Handle calculation when size is an even number
            result0 = Math.abs(inputInteger.get(size - 1) + inputInteger.get(size + 1));
            
        }
        */
        for (int i = 0; i < inputInteger.length; i++)
        {
            for (int j = 0; j < inputInteger.length; j++)
            {
                System.out.println(inputInteger[i][j]);
            }
        }
        System.out.print(result);
    }
}