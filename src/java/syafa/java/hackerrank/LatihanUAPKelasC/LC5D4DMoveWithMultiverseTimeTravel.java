package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC5D4DMoveWithMultiverseTimeTravel
{
    static final int WORLD_SIZE_LIMIT = 3;
    static final int STEP_LIMIT = 16;
    static final int WORLD_DUPLICATE_LIMIT = 8;
    static String[][][][] worldData = new String[WORLD_DUPLICATE_LIMIT][STEP_LIMIT][WORLD_SIZE_LIMIT][WORLD_SIZE_LIMIT];
    static int[][] position = new int[WORLD_DUPLICATE_LIMIT][STEP_LIMIT];
    static int[] stepCounter = new int[WORLD_DUPLICATE_LIMIT];
    static int worldCounter = 0;
    public static void move()
    {
        for (int i = 0; i < position.length; i++)
        {
            for (int j = 0; j < position.length; j++)
            {
                worldData[worldCounter][stepCounter[worldCounter]][i][j] = "";
            }
        }
    }
    public static void main(String[] args)
    {
        /*
         * move right
         * move up
         * move left
         * move left
         * step 2
         * move down
         * stop
         * 
         * move {direction}  
         * step {indexStep}  
         * world {indexWorld}  
         * stop
         */
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine())
        {
            String[] tempInput = input.nextLine().split("\s");
            if (tempInput[0].equalsIgnoreCase("Move"))
            {
                //
            }
            if (tempInput[0].equalsIgnoreCase("Step"))
            {
                //
            }
            if (tempInput[0].equalsIgnoreCase("World"))
            {
                //
            }
            if (tempInput[0].equalsIgnoreCase("Stop"))
            {
                //
            }
        }
        input.close();
    }
}