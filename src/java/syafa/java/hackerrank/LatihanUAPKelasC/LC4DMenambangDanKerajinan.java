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
        HashMap<Integer,String> registeredBlock = new HashMap<>();
        while (input.hasNextLine())
        {
            //
        }
        input.close();
    }
}