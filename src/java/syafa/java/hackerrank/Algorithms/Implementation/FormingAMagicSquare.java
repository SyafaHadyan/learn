package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
import java.util.stream.*;

public class FormingAMagicSquare
{
    public static void main(String[] args)
    {
        /*
         * 5 3 4 1 5 8 6 4 2
         * x x x x x x x x x
         * 
         * sort
         * 1 2 3 4 4 5 5 6 8
         * 
         * iterate through element then add by val (no possible minimum increment)
         * 
         * 
         * element  validElement    passValue
         * 1        1               pass
         * 2        2               pass
         * 3        3               pass
         * 4        4               pass
         * 4        5               not pass > counter += Math.abs(validElement - element) (value = 1)  total = 1
         * 4        6               not pass > counter += Math.abs(validElement - element) (value = 2)  total = 3
         * 5        7               not pass > counter += Math.abs(validElement - element) (value = 2)  total = 5
         * 6        8               not pass > counter += Math.abs(validElement - element) (value = 2)  total = 7
         * 8        9               not pass > counter += Math.abs(validElement - element) (value = 1)  total = 8
         * 
         * element  validElement    passValue   elementHasValue
         * 1        1               pass
         * 2        2               pass
         * 3        3               pass
         * 4        4               pass
         * 5        5               not pass    yes, at val 7, swap
         * 6        6               not pass    yes, at val 8, swap
         * 4        7               not pass    no                 > counter += Math.abs(validElement - element) (value = 3)  total = 3
         * 4        8               not pass    no                 > counter += Math.abs(validElement - element) (value = 4)  total = 7
         * 8        9               not pass    no                 > counter += Math.abs(validElement - element) (value = 1)  total = 8
         * 
         * Use possible match int[][][]
         */
        Scanner input = new Scanner(System.in);
        int[][][] possibleMatch =
        {
            { {8, 1, 6}, {3, 5, 7}, {4, 9, 2} },
            { {6, 1, 8}, {7, 5, 3}, {2, 9, 4} },
            { {4, 9, 2}, {3, 5, 7}, {8, 1, 6} },
            { {2, 9, 4}, {7, 5, 3}, {6, 1, 8} },
            { {8, 3, 4}, {1, 5, 9}, {6, 7, 2} },
            { {4, 3, 8}, {9, 5, 1}, {2, 7, 6} },
            { {6, 7, 2}, {1, 5, 9}, {8, 3, 4} },
            { {2, 7, 6}, {9, 5, 1}, {4, 3, 8} }
        };
        int[][] inputNumber = new int[3][3];
        int counter = 0;
        for (int i = 0; i < 3; i++)
        {
            inputNumber[i] = Stream.of(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        input.close();
    }
}