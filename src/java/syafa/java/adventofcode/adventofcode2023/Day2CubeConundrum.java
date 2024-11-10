package syafa.java.adventofcode.adventofcode2023;
import java.util.*;
import java.util.stream.*;

public class Day2CubeConundrum
{
    //static final int[] CUBE_CONFIG = {12,13,14};
    static final Map<String,Integer> CUBE_CONFIG = Map.ofEntries
        (
            Map.entry("Red",12),
            Map.entry("Green",13),
            Map.entry("Blue",14)
        );
    public static void main(String[] args)
    {
        /*
         * Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green
         * Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue
         * Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red
         * Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red
         * Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green
         * 
         * only 12 red cubes, 13 green cubes, and 14 blue cubes
         */
        Scanner input = new Scanner(System.in);
        int possibleIdSum = 0;
        System.out.println(CUBE_CONFIG);
        while (input.hasNextLine())
        {
            int gameId = 0;
            int[] currentCubeConfig = new int[3];
            String[] currentGame = input.nextLine().split("\\W+");
            for (int i = 2; i < (currentGame.length - 2); i += 2)
            {
                //if ()
                /*
                if (currentGame[i].equalsIgnoreCase("Red"))
                {
                    //
                }
                else if (currentGame[i].equalsIgnoreCase("Green"))
                {
                    //
                }
                else if (currentGame[i].equalsIgnoreCase("Blue"))
                {
                    //
                }
                */
            }
            //if ()
        }
        input.close();
    }
}