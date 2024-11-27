package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;
import java.util.stream.*;

public class LC4DMenambangDanKerajinan
{
    static final ArrayList<String> VALID_BLOCK_LIST = new ArrayList<>(Arrays.asList
    (
        "air",
        "dirt",
        "grass",
        "wood",
        "stone"
    ));
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] coordinateLimit = Stream.of(input.nextLine().split("\s")).mapToInt(Integer::parseInt).toArray();
        HashMap<List<Integer>,String> registeredBlock = new HashMap<>();
        while (input.hasNextLine())
        {
            String[] tempInput = input.nextLine().split("\s");
            if (!(tempInput[0].equalsIgnoreCase("Stop")))
            {
                registeredBlock.put
                (
                    Collections.unmodifiableList
                    (
                        Arrays.asList(Integer.parseInt(tempInput[1]),Integer.parseInt(tempInput[2],Integer.parseInt(tempInput[3])))
                    ),
                    tempInput[0]
                );
            }

        }
        input.close();
    }
}