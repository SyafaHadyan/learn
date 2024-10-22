package syafa.java.hackerrank.latsolpemdastif24;
import java.util.*;
import java.util.stream.*;

public class JumlahBarisDanKolom
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] arraySize = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] array = new int[arraySize[3]][];
        int[] rowSum = new int[3];
        int[] colSum = new int[3];
        for (int i = 0; i < arraySize.length; i++)
        {
            array[i] = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < array[i].length; j++)
            {
                
            }
        }
        input.close();
    }
}