package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;
import java.util.stream.*;

public class JumlahBarisDanKolom
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] arraySize = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] array = new int[arraySize[0]][];
        int[] rowSum = new int[arraySize[0]];
        int[] colSum = new int[arraySize[1]];
        for (int i = 0; i < arraySize[0]; i++)
        {
            array[i] = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        input.close();
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                rowSum [i] += array[i][j];
            }
        }
        for (int i = 0; i < array[0].length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                colSum[i] += array[j][i];
            }
        }
        System.out.print("Hasil penjumlahan pada baris adalah ");
        for (int i = 0; i < rowSum.length; i++)
        {
            System.out.print(rowSum[i]);
            if (rowSum.length - i != 1)
            {
                System.out.print(' ');
            }
        }
        System.out.print("\n" + "Hasil penjumlahan pada kolom adalah ");
        for (int i = 0; i < colSum.length; i++)
        {
            System.out.print(colSum[i]);
            if (colSum.length - i != 1)
            {
                System.out.print(' ');
            }
        }
    }
}