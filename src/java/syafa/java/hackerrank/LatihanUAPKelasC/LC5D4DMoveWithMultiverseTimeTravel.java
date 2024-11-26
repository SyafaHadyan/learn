package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC5D4DMoveWithMultiverseTimeTravel
{
    static final int WORLD_SIZE_LIMIT = 3;
    static final int STEP_LIMIT = 16;
    static final int WORLD_DUPLICATE_LIMIT = 8;
    static final int[] INITIAL_POSITION = {1,1};
    static final int DIVIDER_WIDTH = 10;
    static String[][][][] worldData = new String[WORLD_DUPLICATE_LIMIT][STEP_LIMIT][WORLD_SIZE_LIMIT][WORLD_SIZE_LIMIT];
    static int[][][] position = new int[WORLD_DUPLICATE_LIMIT][STEP_LIMIT][2];
    static int[] stepCounter = new int[WORLD_DUPLICATE_LIMIT];
    static int worldCounter = 0;
    static int highestWorld = 0;
    public static int[] moveUtil(String direction,int coordinateX,int coordinateY)
    {
        if (direction.equalsIgnoreCase("Up"))
        {
            return new int[]{--coordinateX,coordinateY};
        }
        if (direction.equalsIgnoreCase("Down"))
        {
            return new int[]{++coordinateX,coordinateY};
        }
        if (direction.equalsIgnoreCase("Right"))
        {
            return new int[]{coordinateX,++coordinateY};
        }
        if (direction.equalsIgnoreCase("Left"))
        {
            return new int[]{coordinateX,--coordinateY};
        }
        return new int[]{coordinateX,coordinateY};
    }
    public static void printUtil()
    {
        for (int i = 0; i <= highestWorld; i++)
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
                (((position[worldCounter][stepCounter[worldCounter]][0] == i) && (position[worldCounter][stepCounter[worldCounter]][1] == j))? "o" : ".");
                // System.err.println(Arrays.toString(position[worldCounter][stepCounter[worldCounter]]));
                // System.err.println(worldData[worldCounter][stepCounter[worldCounter]][i][j]);
                // System.err.println(Arrays.toString((new int[]{i,j})));
            }
        }
    }
    public static void move(String direction)
    {
        position[worldCounter][stepCounter[worldCounter] + 1] = moveUtil(direction,position[worldCounter][stepCounter[worldCounter]][0],position[worldCounter][stepCounter[worldCounter]][1]);
        stepCounter[worldCounter]++;
        for (int i = 0; i < WORLD_SIZE_LIMIT; i++)
        {
            for (int j = 0; j < WORLD_SIZE_LIMIT; j++)
            {
                worldData[worldCounter][stepCounter[worldCounter]][i][j] =
                (((position[worldCounter][stepCounter[worldCounter]][0] == i) && (position[worldCounter][stepCounter[worldCounter]][1] == j))? "o" : ".");
            }
        }
    }
    public static void step(int stepPosition)
    {
        position[worldCounter + 1][0] = position[worldCounter][stepPosition];
        worldCounter++;
        highestWorld = worldCounter;
        for (int i = 0; i < WORLD_SIZE_LIMIT; i++)
        {
            for (int j = 0; j < WORLD_SIZE_LIMIT; j++)
            {
                worldData[worldCounter][stepCounter[worldCounter]][i][j] =
                (((position[worldCounter][stepCounter[worldCounter]][0] == i) && (position[worldCounter][stepCounter[worldCounter]][1] == j))? "o" : ".");
            }
        }
    }
    public static void world(int targetWorld)
    {
        if (worldCounter > highestWorld)
        {
            highestWorld = worldCounter;
        }
        worldCounter = targetWorld;
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
                step(Integer.parseInt(tempInput[1]));
            }
            if (tempInput[0].equalsIgnoreCase("World"))
            {
                world(Integer.parseInt(tempInput[1]));
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