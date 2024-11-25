package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC5D4DMoveWithMultiverseTimeTravel
{
    static final int WORLD_SIZE_LIMIT = 3;
    static final int STEP_LIMIT = 16;
    static final int WORLD_DUPLICATE_LIMIT = 8;
    static final int INITIAL_POSITION = 11;
    static final int DIVIDER_WIDTH = 10;
    static String[][][][] worldData = new String[WORLD_DUPLICATE_LIMIT][STEP_LIMIT][WORLD_SIZE_LIMIT][WORLD_SIZE_LIMIT];
    static int[][] position = new int[WORLD_DUPLICATE_LIMIT][STEP_LIMIT];
    static int[] stepCounter = new int[WORLD_DUPLICATE_LIMIT];
    static int worldCounter = 0;
    public static int moveUtil(String direction,int currentCoordinate)
    {
        if (direction.equalsIgnoreCase("Up"))
        {
            return currentCoordinate += 10;
        }
        if (direction.equalsIgnoreCase("Down"))
        {
            return currentCoordinate -= 10;
        }
        if (direction.equalsIgnoreCase("Right"))
        {
            return currentCoordinate += 1;
        }
        if (direction.equalsIgnoreCase("Left"))
        {
            return currentCoordinate -= 1;
        }
        return currentCoordinate;
    }
    public static void printUtil()
    {
        for (int i = 0; i <= worldCounter; i++)
        {
            for (int j = 0; j <= stepCounter[i]; j++)
            {
                System.out.printf("%-2c%-6s%d %-2c%-2c%-5s%d %c\n",'[',"world",i,']','(',"step",j,')');
                for (int k = 0; k < WORLD_SIZE_LIMIT; k++)
                {
                    for (int l = 0; l < WORLD_SIZE_LIMIT; l++)
                    {
                        System.out.print(worldData[i][j][k][l] + ((WORLD_SIZE_LIMIT - l != 1) ? " " : "\n"));
                    }
                }
                for (int k = 0; k < DIVIDER_WIDTH; k++)
                {
                    System.out.print('-');
                }
                System.out.print("\n");
            }
        }
    }
    public static void initialStartingPosition()
    {
        position[worldCounter][stepCounter[worldCounter]] = INITIAL_POSITION;
        for (int i = 0; i < WORLD_SIZE_LIMIT; i++)
        {
            for (int j = 0; j < WORLD_SIZE_LIMIT; j++)
            {
                worldData[worldCounter][stepCounter[worldCounter]][i][j] =
                ((position[worldCounter][stepCounter[worldCounter]] == Integer.parseInt(String.valueOf(i) + String.valueOf(j)) ? "o" : "."));
            }
        }
    }
    public static void move(String direction)
    {
        stepCounter[worldCounter]++;
        position[worldCounter][stepCounter[worldCounter]] = moveUtil(direction,position[worldCounter][stepCounter[worldCounter] - 1]);
        for (int i = 0; i < WORLD_SIZE_LIMIT; i++)
        {
            for (int j = 0; j < WORLD_SIZE_LIMIT; j++)
            {
                worldData[worldCounter][stepCounter[worldCounter]][i][j] =
                ((position[worldCounter][stepCounter[worldCounter]] == Integer.parseInt(String.valueOf(i) + String.valueOf(j)) ? "o" : "."));
            }
        }
    }
    public static void step(int stepPosition)
    {
        for (int i = 0; i < position.length; i++)c
        {
            for (int j = 0; j < position.length; j++)
            {
                worldData[worldCounter + 1][stepPosition][i][j] = worldData[worldCounter][stepPosition][i][j];
            }
        }
        worldCounter++;
    }
    public static void world()
    {
        //
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
                move(tempInput[1]);
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
                printUtil();
                break;
            }
        }
        input.close();
    }
}