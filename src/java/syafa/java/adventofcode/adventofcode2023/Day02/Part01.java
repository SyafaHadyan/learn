package syafa.java.adventofcode.adventofcode2023.Day02;
import java.util.*;

public class Part01
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