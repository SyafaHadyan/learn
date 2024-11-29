package syafa.java.adventofcode.adventofcode2017.Day24;
import java.util.*;
import java.util.stream.*;

public class Part01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        HashMap<List<Integer>,Integer> bridge = new HashMap<>();
        List<List<Integer>> startingPosition = new ArrayList<>();
        ArrayList<Integer> possibleCombination = new ArrayList<>();
        int largestPort = 0;
        int bridgeStrength = 0;
        while (input.hasNextLine())
        {
            int[] tempInput = Stream.of(input.nextLine().split("/")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(tempInput);
            if (tempInput[0] != 0)
            {
                bridge.putIfAbsent(Collections.unmodifiableList(Arrays.asList(tempInput[0],tempInput[1])),(tempInput[0] + tempInput[1]));
            }
            for (int i = 0; i < tempInput.length; i++)
            {
                if (!(possibleCombination.contains(tempInput[i])) && tempInput[i] != 0)
                {
                    System.err.println("Combination " + tempInput[i]);
                    possibleCombination.add(tempInput[i]);
                }
            }
            System.err.println("Current possible combination " + possibleCombination);
            if (tempInput[0] == 0)
            {
                System.err.println("Possible first port " +  tempInput[0] + " " + tempInput[1]);
                startingPosition.add(Collections.unmodifiableList(Arrays.asList(tempInput[0],tempInput[1])));
            }
            if (tempInput[1] > largestPort)
            {
                System.err.print("Largest port from " + largestPort);
                largestPort = tempInput[1];
                System.err.println(" to " + largestPort);
            }
            System.out.println("Current largest port " + largestPort);
            System.err.println("Bridge "+ bridge);
            System.err.println("Starting position "+ startingPosition);
            System.err.println("Possible combination "+ possibleCombination + "\n");
        }
        input.close();
        Collections.sort(possibleCombination);
        System.err.println("Bridge "+ bridge);
        System.err.println("Starting position "+ startingPosition);
        System.err.println("Possible combination sorted "+ possibleCombination);
        for (List<Integer> i : startingPosition)
        {
            System.err.println("Starting position " + i);
            int currentBridgeStrength = 0;
            for (int j = 1; j < bridge.size(); j++)
            {
                ArrayList<Integer> getKey = new ArrayList<Integer>(Arrays.asList(i.getLast(),possibleCombination.get(j)));
                System.err.println(getKey);
                if (bridge.containsKey(getKey))
                {
                    currentBridgeStrength += getKey.getLast();
                    System.err.println(getKey);
                    System.err.println("Match value at " + currentBridgeStrength + " with key " + getKey);
                    getKey.set(0,getKey.getLast());
                    System.err.println(getKey);
                    for (int k = 1; k <= possibleCombination.size(); k++)
                    {
                        for (int l = possibleCombination.getFirst(); l < possibleCombination.getLast(); l++)
                        {
                            getKey.set(1,l);
                            System.err.println(getKey);
                            if (bridge.containsKey(getKey))
                            {
                                currentBridgeStrength += bridge.get(getKey);
                                System.err.println(currentBridgeStrength);
                                System.err.println(bridge);
                            }
                        }
                    }
                }
            }
            if (currentBridgeStrength > bridgeStrength)
            {
                System.err.println("Current higher " + currentBridgeStrength);
                bridgeStrength = currentBridgeStrength;
                System.err.println("Current bridge strength " + bridgeStrength);
                currentBridgeStrength = 0;
            }
            System.err.println();
        }
        System.out.println(bridgeStrength);
    }
}