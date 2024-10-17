package syafa.java.hackerrank.LiveCoding3TIFC;
import java.util.*;

public class PossibleQuestionSegitigaAjaib11
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int triangleLevel = Integer.parseInt(input.nextLine());
        input.close();
        int space = triangleLevel - 1;
        int[][] values = new int[triangleLevel + 1][triangleLevel + 1];
        int[][] prevValues = new int[triangleLevel + 1][triangleLevel + 1];
        /*
         * 1
         * 1 1
         * 1 2 1
         * 1 3 3 1
         * 1 4 6 4 1
         * 1 5 10 10 5 1
         */
        /*
         *     1
         *    1 1
         *   1 2 1
         *  1 3 3 1
         * 1 4 6 4 1
         */
        
        //prevValues[0] = 1;
        for (int i = 0; i < triangleLevel; i++)
        {
            for (int j = 0; j < triangleLevel; j++)
            {
                for (int k = 0; k <= j; k++)
                {
                    //System.out.print(values[j]);
                    try
                    {
                        if (k == 0 || k == 1)
                        {
                            values[j][k] = 1;
                        }
                        else
                        {
                            values[j][k] = values[j - 1][k - 1] + values[j - 1][k];
                        }
                    }
                    catch (IndexOutOfBoundsException e)
                    {
                        /*
                        for (int l = 0; l < values.length; l++)
                        {
                            prevValues[k] = values[j];
                            System.out.print(values[k]);
                            if (values.length - k != 1)
                            {
                                System.out.println("\n");
                            }
                        }
                        */
                    }
                }
            }
            for (int j = 0; j < space; j++)
            {
                System.out.print(' ');
            }
            space--;
            for (int j = 0; j <= i; j++)
            {
                System.out.print('a');
                if ((j - triangleLevel != 0) && (i != 0))
                {
                    System.out.print(' ');
                }
            }
            if (triangleLevel - i != 1)
            {
                System.out.print("\n");
            }
        }
    }
}