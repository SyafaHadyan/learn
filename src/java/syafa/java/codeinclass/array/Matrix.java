package syafa.java.codeinclass.array;
import java.util.*;
import java.util.stream.*;

public class Matrix
{
    class getMatrix
    {
        @SuppressWarnings("resource")
        public static int[][] getFirstMatrix(int matrixSize[])
        {
            Scanner input = new Scanner(System.in);
            int[][] firstMatrix = new int[matrixSize[0]][];
            System.out.printf("%-50s%c\n","Input first matrix [Column] (Separate by space)",':');
            for (int i = 0; i < matrixSize[0]; i++)
            {
                firstMatrix[i] = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            }
            //input.close();
            return firstMatrix;
        }
        @SuppressWarnings("resource")
        public static int[][] getSecondMatrix(int matrixSize[])
        {
            Scanner input = new Scanner(System.in);
            int[][] secondMatrix = new int[matrixSize[1]][];
            System.out.printf("%-50s%c\n","Input second matrix [Column] (Separate by space)",':');
            for (int i = 0; i < matrixSize[1]; i++)
            {
                secondMatrix[i] = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            }
            //input.close();
            return secondMatrix;
        }
    }
    public static void main(String[] args)
    {
        /*
         * TODO
         * 
         * Multiply first and Second Matrix
         * Inverse
         * Transpose
         * Add try-catch if user can't read instruction properly
         */
        Scanner input = new Scanner(System.in);
        System.out.printf("%-50s%-2c","Input matrix sizes [First Row] [Second Row]",':');
        int[] matrixSize = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] firstMatrix = getMatrix.getFirstMatrix(matrixSize);
        int[][] secondMatrix = getMatrix.getSecondMatrix(matrixSize);
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
                matrixSize = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();        
                firstMatrix = getMatrix.getFirstMatrix(matrixSize);
                secondMatrix = getMatrix.getSecondMatrix(matrixSize);
                newValue = false;
            }
            int[] substractOrder = new int[2];
            int[][] matrixResult = new int[matrixSize[0]][(firstMatrix[0].length + secondMatrix[0].length) / 2];
            int[][] matrixMultiplicationResult = new int[matrixSize[0]][secondMatrix[0].length];
            int[][][] matrixMultiply = new int[2][matrixSize[0]][(firstMatrix.length + secondMatrix.length) / 2];
            if (firstMatrix.length != secondMatrix[0].length)
            {
                possibleMultiplication = false;
                possibleMultiplicationOption = " [Not possible due to matrix size]";
            }
            System.out.printf("%s\n%s\n%s%s\n%s\n%-20s%-2c",
                    "(0) Add","(1) Substract","(2) Multiply",possibleMultiplicationOption,"(3) Multiply matrix by n","Choose operation",':');
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
                // Temporary Disabled, if selected, it will return previous value or 0
                int counter = 1;
                if (possibleMultiplication)
                {
                    for (int i = 0; i < firstMatrix.length; i++)
                    {
                        for (int j = 0; j < secondMatrix[i].length; j++)
                        {
                            // Testing
                            //matrixResult[firstMatrix.length][secondMatrix[0].length] += firstMatrix[i][j] * secondMatrix[i][j];
                            //matrixMultiplicationResult[i][counter - 1] += firstMatrix[i][counter - 1] * secondMatrix[i][counter - 1];
                            counter++;
                            if (counter % 2 == 0)
                            {
                                j--;
                            }
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
                    option = -1;
                }
            }
            else if (option == 3)
            {
                System.out.printf("%-30s%-2c","Choose value to multiply matrix with",':');
                multiplyMatrix = Integer.parseInt(input.nextLine());
                for (int i = 0; i < matrixMultiply.length; i++)
                {
                    for (int j = 0; j < matrixResult[i].length; j++)
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
            if (option != 2 && option != 3 && option >= 0)
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
                    for (int j = 0; j < matrixMultiplicationResult[0].length; j++)
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
    }
}