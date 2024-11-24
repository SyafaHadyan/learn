package syafa.java.hackerrank.LatihanUAPKelasC;
import java.util.*;

public class LC4DMenambangDanKerajinan
{
    static final List<String> VALID_BLOCK = Arrays.asList
    (
        "dirt",
        "grass",
        "wood",
        "stone"
    );
    public static void showSortBlock(String[][] blockList,int borderX,int borderY,int borderZ)
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < borderX; j++)
            {
                for (int k = 0; k < borderY; k++)
                {
                    for (int l = 0; l < borderZ; l++)
                    {
                        //
                    }
                }
            }
        }
    }
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
                VALID_BLOCK.contains(blockName) &&
                tempX <= borderX && tempX >= 0 &&
                tempY <= borderY && tempY >= 0 &&
                tempZ <= borderZ && tempZ >= 0
            );
            {
                blockList[blockCounter] = new String(blockName + " " + tempX + " " + tempY + " " + tempZ).split("\s");
                blockCounter++;
                System.err.println("Match " + blockName + " with " + tempX + " " + tempY + " " + tempZ + " " );
            }
        }
        input.close();
    }
}