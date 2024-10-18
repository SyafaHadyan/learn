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
         * Add try-catch if user can't read
         */
        Scanner input = new Scanner(System.in);
        System.out.printf("%-50s%-2c","Input matrix sizes [First Row] [Second Row]",':');
        int[] matrixSize = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] substractOrder = new int[2];
        int[][] firstMatrix = new int[matrixSize[0]][];
        int[][] secondMatrix = new int[matrixSize[1]][];
        int option = 0;
        boolean possibleMultiplication = true;
        boolean repeatCalculation = true;
        String possibleMultiplicationOption = "";
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
        System.out.printf("%s\n%s\n%s%s\n%-20s%-2c","(0) Add","(1) Substract","(2) Multiply",possibleMultiplicationOption,"Choose operation",':');
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
                for (int i = 0; i < firstMatrix.length; i++)
                {
                    for (int j = 0; j < secondMatrix[i].length; j++)
                    {
                        // Not tested
                        matrixResult[i][j] = firstMatrix[i][j] * secondMatrix[i][j];
                    }
                }
            }
            else
            {
                input.close();
                System.out.println("[Not possible due to matrix size]" + "\n" + "First matrix" + ':');
                for (int i = 0; i < firstMatrix.length; i++)
                {
                    for (int j = 0; j < firstMatrix[i].length; j++)
                    {
                        System.out.print(firstMatrix[i][j]);
                        if (firstMatrix[i].length - j != 1)
                        {
                            System.out.print(' ');
                        }
                    }
                    if (firstMatrix.length - i != 1)
                    {
                        System.out.print("\n");
                    }
                }
                System.out.println("\n" + "Second matrix" + ':');
                for (int i = 0; i < secondMatrix.length; i++)
                {
                    for (int j = 0; j < secondMatrix[i].length; j++)
                    {
                        System.out.print(secondMatrix[i][j]);
                        if (secondMatrix[i].length - j != 1)
                        {
                            System.out.print(' ');
                        }
                    }
                    if (secondMatrix.length - i != 1)
                    {
                        System.out.print("\n");
                    }
                }
                return;
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