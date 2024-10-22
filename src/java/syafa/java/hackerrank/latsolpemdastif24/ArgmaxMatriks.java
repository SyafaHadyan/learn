package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;
import java.util.stream.*;

public class ArgmaxMatriks
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] arraySize = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] array = new int[arraySize[0]][];
        int[] maxValue = new int[3];
        for (int i = 0; i < arraySize[0]; i++)
        {
            array[i] = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < array[i].length; j++)
            {
                if (array[i][j] > maxValue[2])
                {
                    maxValue[2] = array[i][j];
                    maxValue[0] = i;
                    maxValue[1] = j;
                }
            }
        }
        input.close();
        System.out.print("[" + maxValue[0] + ", " +  maxValue[1] + "]");
    }
}