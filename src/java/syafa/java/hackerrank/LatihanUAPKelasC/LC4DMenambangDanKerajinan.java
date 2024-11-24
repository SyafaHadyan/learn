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
        int borderX = input.nextInt();
        int borderY = input.nextInt();
        int borderZ = input.nextInt(); input.nextLine();
        String[][] blockList = new String[128][4];
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
                tempX <= borderX && tempX >= 0 &&
                tempY <= borderY && tempY >= 0 &&
                tempZ <= borderZ && tempZ >= 0
            );
            {
                blockList[blockCounter] = new String(blockName + " " + tempX + " " + tempY + " " + tempZ).split("\s");
                blockCounter++;
            }
        }
        input.close();
    }
}