package syafa.java.eling.uap2024;
import java.util.*;

public class Rook
{
    static final int CHESS_BOARD_SIZE = 8;
    static final String ROOK_MARK = "#";
    static int[][] rookPosition = new int[CHESS_BOARD_SIZE][2];
    static int rookPositionCounter = 0;
    private static boolean verticalCheck(int verticalPosition)
    {
        for (int i = 0; i < rookPositionCounter; i++)
        {
            if (rookPosition[i][1] == verticalPosition)
            {
                return true;
            }
        }
        return false;
    }
    private static boolean horizontalCheck(int horizontalPosition)
    {
        for (int i = 0; i < rookPositionCounter; i++)
        {
            if (rookPosition[i][0] == horizontalPosition)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int freeCount = 0;
        for (int i = 0; i < CHESS_BOARD_SIZE; i++)
        {
            String[] tempInput = input.nextLine().split("");
            for (int j = 0; j < tempInput.length; j++)
            {
                if (tempInput[j].equalsIgnoreCase(ROOK_MARK))
                {
                    rookPosition[rookPositionCounter][0] = j;
                    rookPosition[rookPositionCounter++][1] = i;
                }
            }
        }
        input.close();
        for (int i = 0; i < CHESS_BOARD_SIZE; i++)
        {
            if (!(verticalCheck(i)))
            {
                for (int j = 0; j < CHESS_BOARD_SIZE; j++)
                {
                    if (!(horizontalCheck(j)))
                    {
                        freeCount++;
                    }
                }
            }
        }
        System.out.println(freeCount);
    }
}