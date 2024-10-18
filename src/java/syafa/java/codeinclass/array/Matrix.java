package syafa.java.codeinclass.array;
import java.util.*;
import java.util.stream.*;

public class Matrix
{
    public static void main(String[] args)
    {
        /*
         * TODO
         * 
         * Check when multiplication is possible
         * Add
         * Substract
         * Multiply first and Second Matrix
         * Multiply matrix n by n
         * Inverse
         * Transpose
         * Ask user if user want to repeat operation using (current matrix/replace matrix n with result)
         */
        boolean possibleMultiplication = true;
        String possibleMultiplicationOption = "";
        Scanner input = new Scanner(System.in);
        System.out.printf("%-50s%-2c","Input matrix sizes [First Row] [Second Row]",':');
        int[] matrixSize = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.printf("%-50s%c\n","Input first matrix [Column] (Separate by space)",':');
        int[][] firstMatrix = new int[matrixSize[0]][];
        int[][] secondMatrix = new int[matrixSize[1]][];
        for (int i = 0; i < matrixSize[0]; i++)
        {
            firstMatrix[i] = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        System.out.printf("%-50s%c\n","Input second matrix [Column] (Separate by space)",':');
        for (int i = 0; i < matrixSize[1]; i++)
        {
            secondMatrix[i] = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        if (firstMatrix.length != secondMatrix[0].length)
        {
            possibleMultiplication = false;
            possibleMultiplicationOption = " [Not possible due to matrix size]";
        }
        System.out.printf("%-20s%c\n%s\n%s\n%s%s","Choose operation",':',"Add","Substract","Multiply",possibleMultiplicationOption);
        input.close();
    }
}