package syafa.java.adventofcode.adventofcode2017.Day24;
import java.util.*;
import java.util.stream.*;

public class Part01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        HashMap<List<Integer>,Integer> bridge = new HashMap<>();
        List<List<Integer>> possibleKeySet = new ArrayList<>();
        int largestPort = 0;
        int bridgeStrength = 0;
        while (input.hasNextLine())
        {
            int[] tempInput = Stream.of(input.nextLine().split("/")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(tempInput);
            bridge.put(Collections.unmodifiableList(Arrays.asList(tempInput[0],tempInput[1])),(tempInput[0] + tempInput[1]));
            if (tempInput[0] == 0)
            {
                System.err.println("Possible first port " +  tempInput[0] + " " + tempInput[1]);
            }
            possibleKeySet.add(Collections.unmodifiableList(Arrays.asList(tempInput[0],tempInput[1])));
            for (int i = 0; i < tempInput.length; i++)
            {
                if (tempInput[i] > largestPort)
                {
                    System.err.print("Largest port from " + largestPort);
                    largestPort = tempInput[i];
                    System.err.println(" to " + largestPort);
                }
            }
            System.out.println("Current largest port " + largestPort + "\n");
        }
        input.close();
        for (List<Integer> i : possibleKeySet)
        {
            int currentBridgeStrength = 0;
            for (int j = 1; true; j++)
            {
                List<Integer> getKey = Collections.unmodifiableList(Arrays.asList(i.getFirst(),j));
                if (bridge.containsKey(getKey) && bridge.get(getKey) > bridgeStrength)
                {
                    currentBridgeStrength += bridge.get(getKey);
                    System.err.println(getKey);
                    System.err.println("Match higher value at " + bridgeStrength);
                }
                if (j == largestPort)
                {
                    System.err.println("Break");
                    break;
                }
            }
            if (currentBridgeStrength > bridgeStrength)
            {
                System.err.println("Current higher " + currentBridgeStrength);
                bridgeStrength = currentBridgeStrength;
                System.err.println("Current bridge strength " + bridgeStrength);
            }
            System.err.println();
        }
        System.out.println(bridgeStrength);
    }
}