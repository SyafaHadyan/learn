package syafa.java.adventofcode.adventofcode2017.Day24;
import java.util.*;
import java.util.stream.*;

public class Part01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        HashMap<List<Integer>,Integer> bridge = new HashMap<>();
        while (input.hasNextLine())
        {
            int[] tempInput = Stream.of(input.nextLine().split("/")).mapToInt(Integer::parseInt).toArray();
            bridge.put(Collections.unmodifiableList(Arrays.asList(tempInput[0],tempInput[1])),(tempInput[0] + tempInput[1]));
        }
        input.close();
    }
}