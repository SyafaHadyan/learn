package syafa.java.eling.uap2024;
import java.util.*;

public class Rook
{
    static final int CHESS_BOARD_SIZE = 8;
    static final String ROOK_MARK = "#";
    static int[][] rookPosition = new int[CHESS_BOARD_SIZE][2];
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int freeCount = 0;
        int rookPositionCounter = 0;
        HashMap<Integer,Integer> rookPositionHorizontal = new HashMap<>();
        HashMap<Integer,Integer> rookPositionVertical = new HashMap<>();
        for (int i = 0; i < CHESS_BOARD_SIZE; i++)
        {
            String[] tempInput = input.nextLine().split("");
            for (int j = 0; j < tempInput.length; j++)
            {
                if (tempInput[j].equalsIgnoreCase(ROOK_MARK))
                {
                    rookPosition[rookPositionCounter][0] = j;
                    rookPosition[rookPositionCounter++][1] = i;
                    rookPositionHorizontal.putIfAbsent(j,j);
                    rookPositionVertical.putIfAbsent(i,i);
                }
            }
        }
        input.close();
        for (int i = 0; i < CHESS_BOARD_SIZE; i++)
        {
            if (!(rookPositionVertical.containsKey(i)))
            {
                for (int j = 0; j < CHESS_BOARD_SIZE; j++)
                {
                    if (!(rookPositionHorizontal.containsKey(j)))
                    {
                        freeCount++;
                    }
                }
            }
        }
        System.out.println(freeCount);
    }
}