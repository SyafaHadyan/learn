package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC4DMenambangDanKerajinan
{
    static final Map<String,Boolean> VALID_BLOCK = Map.ofEntries
    (
        Map.entry("dirt",true),
        Map.entry("grass",true),
        Map.entry("wood",true),
        Map.entry("stone",true)
    );
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt(); input.nextLine();
        String[] blockList = new String[128];
        int blockCounter = 0;
        while (input.hasNextLine())
        {
            String blockName = input.next();
            int tempX = input.nextInt();
            int tempY = input.nextInt();
            int tempZ = input.nextInt(); input.nextLine();
            if
            (
                VALID_BLOCK.containsKey(blockName) &&
                tempX <= x && tempX >= 0 &&
                tempY <= y && tempY >= 0 &&
                tempZ <= z && tempZ >= 0
            );
            {
                //
            }
        }
        input.close();
    }
}