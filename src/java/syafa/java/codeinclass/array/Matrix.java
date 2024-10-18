package syafa.java.codeinclass.array;
import java.util.*;
import java.util.stream.*;

public class Matrix
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-55s%-2c","Input matrix size [Row Column] (Separate by space)",':');
        int[] matrixSize = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.printf("%-55s%c\n","Input first matrix [Column] (Separate by space)",':');
        int[][] firstMatrix = new int[matrixSize[0]][];
        for (int i = 0; i < matrixSize[0]; i++)
        {
            firstMatrix[i] = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        System.out.printf("%-55s%c\n","Input second matrix [Column] (Separate by space)",':');
        int[][] secondMatrix = new int[matrixSize[0]][];
        for (int i = 0; i < matrixSize[0]; i++)
        {
            secondMatrix[i] = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        System.out.printf("%-55s%c\n%s\n%s","Choose operation",':',"Add","Substract","Multiply");
        input.close();
    }
}