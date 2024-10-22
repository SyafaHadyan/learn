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
        for (int i = 0; i < args.length; i++)
        {
            array[i] = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        input.close();
    }
}