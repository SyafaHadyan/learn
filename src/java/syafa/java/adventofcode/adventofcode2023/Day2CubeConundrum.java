package syafa.java.adventofcode.adventofcode2023;
import java.util.*;
import java.util.regex.*;

public class Day2CubeConundrum
{
    static final int[] CUBE_CONFIG = {12,13,14};
    static final Map<String,Integer> CUBE_CONFIG_INDEX = Map.ofEntries
        (
            Map.entry("RED",0),
            Map.entry("GREEN",1),
            Map.entry("BLUE",2)
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
        /*
         * TODO
         * 
         * Split based on game set
         */
        Scanner input = new Scanner(System.in);
        int possibleIdSum = 0;
        while (input.hasNextLine())
        {
            boolean possibleConfig = true;
            String rawInput = input.nextLine();
            int currentGameId = Integer.parseInt(rawInput.split("\s")[1].replace(":",""));
            rawInput = rawInput.replaceAll("Game \\d+","");
            rawInput = rawInput.replaceAll(": ","");
            rawInput = rawInput.replaceAll(",","");
            String[] currentGame = rawInput.split(";\\s*");
            for (int i = 0; i < currentGame.length; i++)
            {
                int[] currentCubeConfig = new int[CUBE_CONFIG.length];
                String[] currentGameSet = currentGame[i].split("\s");
                for (int j = 0; j < currentGameSet.length; j += 2)
                {
                    currentCubeConfig[CUBE_CONFIG_INDEX.get(currentGameSet[j + 1].toUpperCase())] += Integer.parseInt(currentGameSet[j]);
                }
                for (int j = 0; j < currentCubeConfig.length; j++)
                {
                    if (currentCubeConfig[j] > CUBE_CONFIG[j])
                    {
                        possibleConfig = false;
                    }
                }
            }
            if (possibleConfig)
            {
                possibleIdSum += currentGameId;
            }
        }
        input.close();
        System.out.print(possibleIdSum);
    }
}