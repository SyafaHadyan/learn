package syafa.java.codingquest.practice2022;
import java.util.*;

public class SurveyAnAsteroidBelt
{
    static final int SPACE_GRID = 8;
    static int[][] asteroidOccupation = new int[SPACE_GRID][SPACE_GRID];
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < asteroidOccupation.length; i++)
        {
            for (int j = 0; j < asteroidOccupation[i].length; j++)
            {
                asteroidOccupation[i][j] = input.nextInt();
                try
                {
                    //
                }
                catch (IndexOutOfBoundsException e)
                {
                    //
                }
            }
            input.nextLine();
        }
        input.close();
    }
}