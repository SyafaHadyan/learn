package syafa.java.hackerrank.Algorithms.Implementation;
import java.util.*;
//import java.util.stream.*;

public class CavityMap
{
    public static void main(String[] args)
    {
        /*
        3
         * 989
         * 191
         * 111
         * 
         * 989
         * 1X1
         * 111
         * 
         * STDIN   Function
         * -----   --------
         * 4       grid[] size n = 4
         * 1112    grid = ['1112', '1912', '1892', '1234']
         * 1912
         * 1892
         * 1234
         * 
         * 1112
         * 1X12
         * 18X2
         * 1234
         * 
         * 4
         * 1112
         * 1912
         * 1892
         * 1234
         * 
         * 
         * 9 in [1][1] is not in border and have depth larger than the left or right
         * 
         */
        Scanner input = new Scanner(System.in);
        int cellSize = Integer.parseInt(input.nextLine());
        String[][] cell = new String[cellSize][cellSize];
        for (int i = 0; i < cellSize; i++)
        {
            cell[i] = input.nextLine().split(" ");
        }
        input.close();
        for (int i = 0; i < cell.length; i++)
        {
            for (int j = 0; j < cell[i].length; j++)
            {
                try
                {
                    if ((Math.abs(Integer.parseInt(cell[i][j - 1]) - Integer.parseInt(cell[i][j])) > 1) && (Math.abs(Integer.parseInt(cell[i][j + 1]) - Integer.parseInt(cell[i][j])) > 1))
                    {
                        cell[i][j] = "X";
                    }
                    //System.out.print(cell[i][j]);
                }
                catch (IndexOutOfBoundsException e)
                {
                    //
                }
                try
                {
                    System.out.print(cell[i][j]);
                }
                catch (IndexOutOfBoundsException e)
                {
                    return;
                }
                if (cell[i].length - j != 1)
                {
                    System.out.print(' ');
                }
            }
            if (cell.length - i != 1)
            {
                System.out.print("\n");
            }
        }
    }
}