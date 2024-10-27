package syafa.java.codeinclass.array;
import java.util.*;
import java.util.stream.*;

public class Matrix
{
    @SuppressWarnings("resource")
    static class getMatrix
    {
        public static int[][] getFirstMatrix(int[] matrixRow)
        {
            Scanner input = new Scanner(System.in);
            int[][] firstMatrix = new int[matrixRow[0]][];
            System.out.printf("%-50s%c\n","Input first matrix [Column] (Separate by space)",':');
            for (int i = 0; i < matrixRow[0]; i++)
            {
                firstMatrix[i] = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            }
            //input.close();
            return firstMatrix;
        }
        public static int[][] getSecondMatrix(int[] matrixRow)
        {
            Scanner input = new Scanner(System.in);
            int[][] secondMatrix = new int[matrixRow[1]][];
            System.out.printf("%-50s%c\n","Input second matrix [Column] (Separate by space)",':');
            for (int i = 0; i < matrixRow[1]; i++)
            {
                secondMatrix[i] = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            }
            //input.close();
            return secondMatrix;
        }
    }
    static class matrixOperation
    {
        public static int matrixMultiplicaiton(int[][] firstMatrix,int[][] secondMatrix,int row,int col)
        {
            int result = 0;
            for (int i = 0; i < secondMatrix.length; i++)
            {
                result += firstMatrix[row][i] * secondMatrix[i][col];
            }
            return result;
        }
        public static int[][] matrixInverse(int[][] matrix)
        {
            int determinant = matrix[0][0] * matrix[1][1] - (matrix[0][1] * matrix[1][0]);
            int temp = matrix[0][0];
            matrix[1][1] = temp;
            matrix[0][1] = -matrix[0][1];
            matrix[1][0] = -matrix[1][0];
            return matrix;
        }
    }
    public static void main(String[] args)
    {
        /*
         * TODO
         * 
         * Inverse
         * Transpose
         */
        Scanner input = new Scanner(System.in);
        System.out.printf("%-50s%-2c","Input matrix sizes [First Row] [Second Row]",':');
        int[] matrixRow = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.printf("%-50s%-2c","Input matrix sizes [First Col] [Second Col]",':');
        int[] matrixCol = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] firstMatrix = getMatrix.getFirstMatrix(matrixRow);
        int[][] secondMatrix = getMatrix.getSecondMatrix(matrixRow);
        int option = 0;
        int multiplyMatrix = 0;
        boolean possibleMultiplication = true;
        boolean repeatCalculation = true;
        boolean newValue = false;
        String possibleMultiplicationOption = "";
        String repeatCalculationConfirmation = "";
        while (repeatCalculation)
        {
            if (newValue)
            {
                System.out.printf("%-50s%-2c","Input matrix sizes [First Row] [Second Row]",':');
                matrixRow = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                System.out.printf("%-50s%-2c","Input matrix sizes [First Col] [Second Col]",':');
                matrixCol = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();      
                firstMatrix = getMatrix.getFirstMatrix(matrixRow);
                secondMatrix = getMatrix.getSecondMatrix(matrixRow);
                newValue = false;
            }
            int[] substractOrder = new int[2];
            int[][] matrixResult = new int[matrixRow[0]][(firstMatrix[0].length + secondMatrix[0].length) / 2];
            int[][] matrixMultiplicationResult = new int[firstMatrix.length][secondMatrix[0].length];
            int[][][] matrixMultiply = new int[2][matrixRow[0]][(firstMatrix.length + secondMatrix.length) / 2];
            if (matrixRow[1] != matrixCol[0])
            {
                possibleMultiplication = false;
                possibleMultiplicationOption = " [Not possible due to matrix size]";
            }
            System.out.printf
            (
                "%s\n%s\n%s%s\n%s\n%s\n%-20s%-2c",
                "(0) Add","(1) Substract","(2) Multiply",possibleMultiplicationOption,
                "(3) Multiply matrix by n",
                "(4) Divide matrix",
                "Choose operation",':'
            );
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
                System.out.printf("%-30s%-2c","Choose order to substract (eg. 1 2 will result in 1-2)",':');
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
                    for (int i = 0; i < matrixMultiplicationResult.length; i++)
                    {
                        for (int j = 0; j < matrixMultiplicationResult[i].length; j++)
                        {
                            matrixMultiplicationResult[i][j] = matrixOperation.matrixMultiplicaiton(firstMatrix,secondMatrix,i,j);
                        }
                    }
                }
                else
                {
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
                    option = -1;
                }
            }
            else if (option == 3)
            {
                System.out.printf("%-30s%-2c","Choose value to multiply matrix with",':');
                multiplyMatrix = Integer.parseInt(input.nextLine());
                for (int i = 0; i < matrixMultiply.length; i++)
                {
                    for (int j = 0; j < matrixMultiply[i].length; j++)
                    {
                        matrixMultiply[0][i][j] = firstMatrix[i][j] * multiplyMatrix;
                    }
                }
                for (int i = 0; i < matrixMultiply.length; i++)
                {
                    for (int j = 0; j < matrixResult[i].length; j++)
                    {
                        matrixMultiply[1][i][j] = secondMatrix[i][j] * multiplyMatrix;
                    }
                }
            }
            else if (option == 4)
            {
                //
            }
            if
            (
                option >= 0 &&
                !(option >= 2) && !(option <= 4)
            )
            {
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
            else if (option == 2)
            {
                for (int i = 0; i < matrixMultiplicationResult.length; i++)
                {
                    for (int j = 0; j < matrixMultiplicationResult[i].length; j++)
                    {
                        System.out.print(matrixMultiplicationResult[i][j]);
                        if (matrixMultiplicationResult[i].length - j != 1)
                        {
                            System.out.print(' ');
                        }
                    }
                    if (matrixMultiplicationResult.length - i != 1)
                    {
                        System.out.print("\n");
                    }
                }
            }
            else if (option == 3)
            {
                for (int i = 0; i < 2; i++)
                {
                    if (i == 0)
                    {
                        System.out.println("First matrix");
                    }
                    else if (i == 1)
                    {
                        System.out.println("Second matrix");
                    }
                    for (int j = 0; j < matrixMultiply.length; j++)
                    {
                        for (int k = 0; k < matrixMultiply.length; k++)
                        {
                            System.out.print(matrixMultiply[i][j][k]);
                            if (matrixMultiply.length - k != 1)
                            {
                                System.out.print(' ');
                            }
                        }
                        if (matrixMultiply.length - j != 1)
                        {
                            System.out.print("\n");
                        }
                    }
                    if (matrixMultiply.length - i != 1)
                    {
                        System.out.print("\n\n");
                    }
                }
            }
            else if (option == 4)
            {
                //
            }
            System.out.printf("\n%-30s%-2c","Repeat calculation (Y/N)",':');
            repeatCalculationConfirmation = input.nextLine();
            if (repeatCalculationConfirmation.equalsIgnoreCase("Y"))
            {
                repeatCalculation = true;
                System.out.printf("%-30s%-2c","Use previous value (Y/N)",':');
                repeatCalculationConfirmation = input.nextLine();
                if (repeatCalculationConfirmation.equalsIgnoreCase("N"))
                {
                    System.gc();
                    newValue = true;
                }
            }
            else
            {
                repeatCalculation = false;
                input.close();
                return;
            }
        }
        input.close();
    }
}