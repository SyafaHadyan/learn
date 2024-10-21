package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;

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
         */
        Scanner input = new Scanner(System.in);
        input.close();
    }
}