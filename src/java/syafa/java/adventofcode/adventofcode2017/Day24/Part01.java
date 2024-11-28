package syafa.java.adventofcode.adventofcode2017.Day24;
import java.util.*;
import java.util.stream.*;

public class Part01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        HashMap<List<Integer>,Integer> bridge = new HashMap<>();
        int largestPort = 0;
        int bridgeStrength = 0;
        while (input.hasNextLine())
        {
            int[] tempInput = Stream.of(input.nextLine().split("/")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(tempInput);
            bridge.put(Collections.unmodifiableList(Arrays.asList(tempInput[0],tempInput[1])),(tempInput[0] + tempInput[1]));
            for (int i = 0; i < tempInput.length; i++)
            {
                if (tempInput[i] > largestPort)
                {
                    largestPort = tempInput[i];
                }
            }
        }
        input.close();
        for (List<Integer> i : bridge.keySet())
        {
            for (int j = 1; j <= largestPort; j++)
            {
                if (bridge.containsKey(Collections.unmodifiableList(Arrays.asList(i.getFirst(),j))))
                {
                    //
                }
            }
        }
    }
}