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
    public static void showSortBlock(String[][] blockList,int[][] availableBlock,int borderX,int borderY,int borderZ)
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < availableBlock.length; j++)
            {
                for (int k = 0; k < availableBlock.length; k++)
                {
                    if (availableBlock[j][i] > availableBlock[k][i])
                    {
                        int[] tempSwapBlock = availableBlock[k];
                        availableBlock[k] = availableBlock[j];
                        availableBlock[j] = tempSwapBlock;
                        System.err.println(Arrays.toString(availableBlock));
                    }
                }
            }
            System.err.println(Arrays.toString(availableBlock));
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int borderX = input.nextInt();
        int borderY = input.nextInt();
        int borderZ = input.nextInt(); input.nextLine();
        String[][] blockList = new String[128][4];
        int[][] availableBlock = new int[128][3];
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
                tempZ <= borderZ && tempZ >= 0 &&
                (blockName.equalsIgnoreCase("stop"))
            );
            {
                blockList[blockCounter] = new String(blockName + " " + tempX + " " + tempY + " " + tempZ).split("\s");
                availableBlock[blockCounter][0] = tempX;
                availableBlock[blockCounter][1] = tempY;
                availableBlock[blockCounter][2] = tempZ;
                blockCounter++;
                System.err.println("Match " + blockName + " with " + tempX + " " + tempY + " " + tempZ + " " );
            }
        }
        input.close();
        showSortBlock(blockList,availableBlock,borderX,borderY,borderZ);
    }
}