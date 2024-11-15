package syafa.java.adventofcode.adventofcode2023.Day02;
import java.util.*;

public class Part02
{
    static final Map<String,Integer> CUBE_CONFIG_INDEX = Map.ofEntries
        (
            Map.entry("RED",0),
            Map.entry("GREEN",1),
            Map.entry("BLUE",2)
        );
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int maxSum = 0;
        while (input.hasNextLine())
        {
            String rawInput = input.nextLine();
            int[] maxColorCombination = new int[CUBE_CONFIG_INDEX.size()];
            int currentSum = 1;
            rawInput = rawInput.replaceAll("Game \\d+","");
            rawInput = rawInput.replaceAll(": ","");
            rawInput = rawInput.replaceAll(",","");
            String[] currentGame = rawInput.split(";\\s*");
            for (int i = 0; i < currentGame.length; i++)
            {
                int[] currentCubeConfig = new int[CUBE_CONFIG_INDEX.size()];
                String[] currentGameSet = currentGame[i].split("\s");
                for (int j = 0; j < currentGameSet.length; j += 2)
                {
                    currentCubeConfig[CUBE_CONFIG_INDEX.get(currentGameSet[j + 1].toUpperCase())] = Integer.parseInt(currentGameSet[j]);
                    if (maxColorCombination[CUBE_CONFIG_INDEX.get(currentGameSet[j + 1].toUpperCase())] < currentCubeConfig[CUBE_CONFIG_INDEX.get(currentGameSet[j + 1].toUpperCase())])
                    {
                        maxColorCombination[CUBE_CONFIG_INDEX.get(currentGameSet[j + 1].toUpperCase())] = currentCubeConfig[CUBE_CONFIG_INDEX.get(currentGameSet[j + 1].toUpperCase())];
                    }
                }
            }
            for (int i = 0; i < CUBE_CONFIG_INDEX.size(); i++)
            {
                currentSum *= maxColorCombination[i];
            }
            maxSum += currentSum;
        }
        input.close();
        System.out.print(maxSum);
    }
}