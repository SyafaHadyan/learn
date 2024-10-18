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
         * Multiply first and Second Matrix
         * Multiply matrix n by n
         * Inverse
         * Transpose
         * Ask user if user want to repeat operation using (current matrix/replace matrix n with result)
         */
        Scanner input = new Scanner(System.in);
        System.out.printf("%-50s%-2c","Input matrix sizes [First Row] [Second Row]",':');
        int[] matrixSize = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int option = 0;
        int[] substractOrder = new int[2];
        boolean possibleMultiplication = true;
        String possibleMultiplicationOption = "";
        int[][] firstMatrix = new int[matrixSize[0]][];
        int[][] secondMatrix = new int[matrixSize[1]][];
        System.out.printf("%-50s%c\n","Input first matrix [Column] (Separate by space)",':');
        for (int i = 0; i < matrixSize[0]; i++)
        {
            firstMatrix[i] = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        System.out.printf("%-50s%c\n","Input second matrix [Column] (Separate by space)",':');
        for (int i = 0; i < matrixSize[1]; i++)
        {
            secondMatrix[i] = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        int[][] matrixResult = new int[matrixSize[0]][(firstMatrix.length + secondMatrix.length) / 2];
        if (firstMatrix.length != secondMatrix[0].length)
        {
            possibleMultiplication = false;
            possibleMultiplicationOption = " [Not possible due to matrix size]";
        }
        System.out.printf("%s\n%s\n%s\n%s%-20s%-2c","(0) Add","(1) Substract","(2) Multiply",possibleMultiplicationOption,"Choose operation",':');
        option = Integer.parseInt(input.nextLine());
        if (option == 0)
        {
            for (int i = 0; i < matrixResult.length; i++)
            {
                for (int j = 0; j < matrixResult[i].length; j++)
                {
                    matrixResult[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
                }
            }
        }
        else if (option == 1)
        {
            System.out.printf("%s%-30s%-2c","Choose order to substract","(eg. 1 2 will result in 1-2)",':');
            substractOrder = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (substractOrder[0] - substractOrder[1] == -1)
            {
                for (int i = 0; i < matrixResult.length; i++)
                {
                    for (int j = 0; j < matrixResult[i].length; j++)
                    {
                        matrixResult[i][j] = firstMatrix[i][j] - secondMatrix[i][j];
                    }
                }
            }
            else if (substractOrder[0] - substractOrder[1] == 1)
            {
                for (int i = 0; i < matrixResult.length; i++)
                {
                    for (int j = 0; j < matrixResult[i].length; j++)
                    {
                        matrixResult[i][j] = secondMatrix[i][j] - firstMatrix[i][j];
                    }
                }    
            }
        }
        else if (option == 2)
        {
            if (possibleMultiplication)
            {
                //
            }
            else
            {
                //
            }
        }
        input.close();
        for (int i = 0; i < matrixResult.length; i++)
        {
            for (int j = 0; j < matrixResult[0].length; j++)
            {
                System.out.print(matrixResult[i][j]);
                if (matrixResult[i].length - j != 1)
                {
                    System.out.print(' ');
                }
            }
            if (matrixResult.length - i != 1)
            {
                System.out.print("\n");
            }
        }
    }
}