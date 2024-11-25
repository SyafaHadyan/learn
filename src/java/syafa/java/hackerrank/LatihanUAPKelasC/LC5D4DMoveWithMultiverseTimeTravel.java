package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC5D4DMoveWithMultiverseTimeTravel
{
    static final int WORLD_SIZE_LIMIT = 3;
    static final int STEP_LIMIT = 16;
    static final int WORLD_DUPLICATE_LIMIT = 8;
    static final int INITIAL_POSITION = 11;
    static String[][][][] worldData = new String[WORLD_DUPLICATE_LIMIT][STEP_LIMIT][WORLD_SIZE_LIMIT][WORLD_SIZE_LIMIT];
    static int[][][] position = new int[WORLD_DUPLICATE_LIMIT][STEP_LIMIT][1];
    static int[][] stepCounter = new int[WORLD_DUPLICATE_LIMIT][STEP_LIMIT];
    static int currentStep = 0;
    static int worldCounter = 0;
    public static void initialStartingPosition()
    {
        position[worldCounter][stepCounter[worldCounter][currentStep]][0] = INITIAL_POSITION;
        for (int i = 0; i < WORLD_SIZE_LIMIT; i++)
        {
            for (int j = 0; j < WORLD_SIZE_LIMIT; j++)
            {
                worldData[worldCounter][stepCounter[worldCounter][currentStep]][i][j] =
                ((position[worldCounter][stepCounter[worldCounter][currentStep]][0] == Integer.parseInt(String.valueOf(i) + String.valueOf(j)) ? "o" : "."));
            }
        }
        System.err.println();
    }
    public static void move(String direction)
    {
        currentStep++;
        stepCounter[worldCounter][currentStep]++;
        for (int i = 0; i < WORLD_SIZE_LIMIT; i++)
        {
            for (int j = 0; j < WORLD_SIZE_LIMIT; j++)
            {
                worldData[worldCounter][stepCounter[worldCounter][currentStep]][i][j] =
                ((position[worldCounter][stepCounter[worldCounter][currentStep]][0] == Integer.parseInt(String.valueOf(i) + String.valueOf(j)) ? "o" : "."));
            }
        }
        System.err.println();
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
        initialStartingPosition();
        while (input.hasNextLine())
        {
            String[] tempInput = input.nextLine().split("\s");
            if (tempInput[0].equalsIgnoreCase("Move"))
            {
                // move(tempInput[1]);
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
                break;
            }
        }
        input.close();
    }
}