package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC5D4DMoveWithMultiverseTimeTravel
{
    static final int WORLD_SIZE_LIMIT = 3;
    static final int STEP_LIMIT = 16;
    static final int WORLD_DUPLICATE_LIMIT = 8;
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
        String[][][][] worldData = new String[WORLD_DUPLICATE_LIMIT][STEP_LIMIT][WORLD_SIZE_LIMIT][WORLD_SIZE_LIMIT];
        int worldCounter = 0;
        int[][] stepCounter = new int[WORLD_DUPLICATE_LIMIT][STEP_LIMIT];
        while (input.hasNextLine())
        {
            String[] tempInput = input.nextLine().split("\s");
            if (!(tempInput[0].equalsIgnoreCase("Stop")))
            {
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
            }
            else
            {
                //
            }
        }
        input.close();
    }
}