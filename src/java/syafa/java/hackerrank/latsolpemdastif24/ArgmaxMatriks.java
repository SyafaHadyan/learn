package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;
import java.util.stream.*;

public class ArgmaxMatriks
{
    public static void main(String[] args)
    {
        /*
         * 2 2
         * 1 2
         * 3 4
         * 
         * [1, 1]
         * 
         * Nilai maksimal terdapat pada baris ke-1 dan kolom ke-1 (indeks dimulai dari 0).
         * 
         * 1 2
         * -1 1
         * 
         * [0, 1]
         */
        Scanner input = new Scanner(System.in);
        int[] arraySize = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] array = new int[arraySize[0]][];
        int[] maxValue = new int[3];
        for (int i = 0; i < args.length; i++)
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
        System.out.print(maxValue[0] + maxValue[1]);
    }
}