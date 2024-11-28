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
            bridge.putIfAbsent(Collections.unmodifiableList(Arrays.asList(tempInput[0],tempInput[1])),(tempInput[0] + tempInput[1]));
            if (tempInput[0] == 0)
            {
                System.err.println("Possible first port " +  tempInput[0] + " " + tempInput[1]);
                possibleKeySet.add(Collections.unmodifiableList(Arrays.asList(tempInput[0],tempInput[1])));
            }
            if (tempInput[1] > largestPort)
            {
                System.err.print("Largest port from " + largestPort);
                largestPort = tempInput[1];
                System.err.println(" to " + largestPort);
            }
            System.out.println("Current largest port " + largestPort + "\n");
        }
        input.close();
        System.err.println(bridge);
        System.err.println(possibleKeySet);
        for (List<Integer> i : possibleKeySet)
        {
            int currentBridgeStrength = 0;
            for (int counter = 0, j = 1; j <= largestPort && counter < bridge.size(); j++)
            {
                ArrayList<Integer> getKey = new ArrayList<Integer>(Arrays.asList(i.getLast(),j));
                System.err.println(getKey);
                if (bridge.containsKey(getKey))
                {
                    currentBridgeStrength += getKey.getLast();
                    System.err.println(getKey);
                    System.err.println("Match higher value at " + currentBridgeStrength);
                    getKey.set(0,getKey.getLast());
                    System.err.println(getKey);
                    for (int k = 1; k <= largestPort; k++)
                    {
                        for (int l = getKey.getFirst(), currentCounter = 0; l <= largestPort && currentCounter < bridge.size(); l++, counter++)
                        {
                            getKey.set(1,l);
                            System.err.println(getKey);
                            if (bridge.containsKey(getKey))
                            {
                                currentBridgeStrength += bridge.get(getKey);
                                k++;
                                System.err.println(currentBridgeStrength);
                                System.err.println(getKey);
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