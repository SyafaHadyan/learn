package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;
import java.util.stream.*;

public class JumlahBarisDanKolom
{
    public static void main(String[] args)
    {
        /*
         * 3 3
         * 10 15 21
         * 11 12 17
         * 31 22 15
         * 
         * Hasil penjumlahan pada baris adalah 46 40 68
         * Hasil penjumlahan pada kolom adalah 52 49 53
         * 
         * 10 15 21 ---> 46
         * 11 12 17 ---> 40
         * 31 22 15 ---> 68
         * | | |
         * v v v
         * 52 49 53
         * 
         * 2 3
         * 5 1 2
         * 3 4 5
         * 
         * Hasil penjumlahan pada baris adalah 8 12
         * Hasil penjumlahan pada kolom adalah 8 5 7
         * 
         * 5 1 2 ---> 8
         * 3 4 5 ---> 12
         * | | |
         * v v v
         * 8 5 7 
         * 
         */
        Scanner input = new Scanner(System.in);
        int[] arraySize = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] array = new int[arraySize[3]][];
        int[] rowSum = new int[3];
        int[] colSum = new int[3];
        for (int i = 0; i < arraySize.length; i++)
        {
            array[i] = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        input.close();
        for (int i = 0; j < array[i].length; i++)
        {
            rowSum [i] = array[i][j]
        }
    }
}